package isp_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    
    public static User user;
    public Admin admin;

    private final Connection connection;
    private final PreparedStatement userLoginStatement;
    private final PreparedStatement adminLoginStatement;

    public Database() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/isp_management", "root", "Tahin123");

            // Prepare the statements for user and admin login
            userLoginStatement = connection.prepareStatement("SELECT * FROM isp_management.user WHERE Phone = ? OR Email = ? OR NickName = ?");
            adminLoginStatement = connection.prepareStatement("SELECT * FROM isp_management.admin WHERE Phone = ? OR Email = ?");
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle the connection error properly
            throw new RuntimeException("Database connection error", e);
        }
    }

    public boolean registration(String fullName, String nickName, String phoneNumber, String email, String password, String address) {
        String sql = "INSERT INTO `isp_management`.`user` (`Full_Name`, `NickName`, `Phone`, `Email`, `Password`, `Address`) VALUES (?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, fullName);
            statement.setString(2, nickName);
            statement.setString(3, phoneNumber);
            statement.setString(4, email);
            statement.setString(5, password);
            statement.setString(6, address);
            
            return statement.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    boolean userLogin(String id, String pass) {
        try {
            userLoginStatement.setString(1, id);
            userLoginStatement.setString(2, id);
            userLoginStatement.setString(3, id);
            
            ResultSet resultSet = userLoginStatement.executeQuery();
            
            while (resultSet.next()) {
                String userName = resultSet.getString("NickName");
                String password = resultSet.getString("Password");
                
                if (pass.equals(password)) {
                    user = new User(
                        resultSet.getString("Full_Name"),
                        resultSet.getString("NickName"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Email"),
                        resultSet.getString("Password"),
                        resultSet.getString("Address")
                    );
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }

    boolean adminLogin(String id, String pass) {
        try {
            adminLoginStatement.setString(1, id);
            adminLoginStatement.setString(2, id);
            
            ResultSet resultSet = adminLoginStatement.executeQuery();
            
            while (resultSet.next()) {
                String password = resultSet.getString("Password");
                
                if (pass.equals(password)) {
                    admin = new Admin(resultSet.getString("Name"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Email"),
                        resultSet.getString("Password")
                    );
                    return true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    User getUserInfo() {
        return user;
    }
}
