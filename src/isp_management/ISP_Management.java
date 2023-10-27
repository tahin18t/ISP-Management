package isp_management;

import static isp_management.Loading.Progress;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ISP_Management {

    public static void main(String[] args) {
        Loading ld = new Loading();
        ld.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(10);
                ld.Progress.setValue(i);

                if (i > 50) {
                    Loading.Wait.setText("Almost Finished..");
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(ISP_Management.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ld.dispose();
        new Link3().setVisible(true);
        /*Connection connection;
        try{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/isp_management", "root", "Tahin123");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM isp_management.admin;");
        }
        catch{
        
        }
        user User = new user();*/
    }
}

class Admin {

    String Name;
    String Phone;
    String Email;
    String Password;

    Admin(String Name, String Phone, String Email, String Password) {
        this.Name = Name;
        this.Phone = Phone;
        this.Email = Email;
        this.Password = Password;
    }

    Admin() {
    }
}

class User {

    String FullName;
    String NickName;
    String PhonNumber;
    String Email;
    private String Password;
    String Address;

    User() {
    }

    public User(String FullName, String NickName, String PhonNumber, String Email, String Password, String Address) {
        this.FullName = FullName;
        this.NickName = NickName;
        this.PhonNumber = PhonNumber;
        this.Email = Email;
        this.Password = Password;
        this.Address = Address;
    }
}
