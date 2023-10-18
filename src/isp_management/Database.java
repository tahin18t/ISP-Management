package isp_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Database {
    
    
    Boolean registration(String FullName, String NickName, String PhonNumber, String Email, String Password, String Address){
        try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/isp_management", "root", "Tahin123");
                
                Statement statement = connection.createStatement();
                //write
                statement.execute("INSERT INTO `isp_management`.`user` (`Full_Name`, `NickName`, `Phone`, `Email`, `Password`, `Address`) VALUES ('"+FullName+"', '"+NickName+"', '"+PhonNumber +"', '"+Email+"', '"+Password+"', '"+Address+"');");
                return true;
            }
            catch (SQLException e) {
                return false;
            }
    }
    
    Boolean UserLogin(String Id, String Pass){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/isp_management", "root", "Tahin123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM isp_management.user;");
            String Phone, Email, Password;
            while (resultSet.next()) {
                Phone = resultSet.getString("Phone");
                Email = resultSet.getString("Email");
                Password = resultSet.getString("Password");
                if((Id.equals(Phone) || Id.equalsIgnoreCase(Email)) && Pass.equals(Password)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
        }
        
        return false;
    }
    
    Boolean AdminLogin(String Id, String Pass){
        Connection connection;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/isp_management", "root", "Tahin123");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM isp_management.admin;");
            String Phone, Email, Password;
            while (resultSet.next()) {
                Phone = resultSet.getString("Phone");
                Email = resultSet.getString("Email");
                Password = resultSet.getString("Password");
                if((Id.equals(Phone) || Id.equalsIgnoreCase(Email)) && Pass.equals(Password)) {
                    return true;
                }
            }
        } catch (SQLException ex) {
        }
        return false;
    }
}
