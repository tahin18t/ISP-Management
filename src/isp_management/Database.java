package isp_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class Database {

    private Connection connection;

    public Database() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/isp_management", "root", "Tahin123");
        } catch (SQLException e) {
            throw new RuntimeException("Database connection error", e);
        }
    }

    public boolean registration(String fullName, String nickName, String phoneNumber, String email, String password, String address) {
        String sql = "INSERT INTO user (Full_Name, NickName, Phone, Email, Password, Address) VALUES (?, ?, ?, ?, ?, ?)";

        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, fullName);
            statement.setString(2, nickName);
            statement.setString(3, phoneNumber);
            statement.setString(4, email);
            statement.setString(5, password);
            statement.setString(6, address);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            //throw new RuntimeException("User registration failed", e);
            return false;
        }
    }

    public User userLogin(String id, String pass) {
        String sql = "SELECT * FROM user WHERE Phone = ? OR Email = ? OR NickName = ?";

        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, id);
            statement.setString(2, id);
            statement.setString(3, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String userName = resultSet.getString("NickName");
                String password = resultSet.getString("Password");

                if (pass.equals(password)) {
                    return new User(
                            resultSet.getString("Full_Name"),
                            resultSet.getString("NickName"),
                            resultSet.getString("Phone"),
                            resultSet.getString("Email"),
                            resultSet.getString("Password"),
                            resultSet.getString("Address")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("User login failed", e);
        }

        return null; // Return null if login fails
    }

    Admin adminLogin(String id, String pass) {
        String sql = "SELECT * FROM admin WHERE Phone = ? OR Email = ? OR Name = ?";

        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, id);
            statement.setString(2, id);
            statement.setString(3, id);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String userName = resultSet.getString("Name");
                String password = resultSet.getString("Password");

                if (pass.equals(password)) {
                    return new Admin(
                            resultSet.getString("Name"),
                            resultSet.getString("Phone"),
                            resultSet.getString("Email"),
                            resultSet.getString("Password")
                    );
                }
            }
        } catch (SQLException e) {

            //throw new RuntimeException("User login failed", e);
            return null;
        }

        return null; // Return null if login fails
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<User> getAllUsers() {
        List<User> userList = new ArrayList<>();

        String sql = "SELECT * FROM user";

        try ( PreparedStatement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                User user = new User(
                        resultSet.getString("Full_Name"),
                        resultSet.getString("NickName"),
                        resultSet.getString("Phone"),
                        resultSet.getString("Email"),
                        resultSet.getString("Password"),
                        resultSet.getString("Address")
                );
                userList.add(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving user data", e);
        }

        return userList;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error closing the database connection", e);
        }
    }
}
