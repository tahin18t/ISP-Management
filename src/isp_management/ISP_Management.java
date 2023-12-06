package isp_management;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ISP_Management {

    public static void main(String[] args) {
        
        System.out.println("hello world");
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

    void setPassword(String newpass) {
        this.Password = newpass;
    }
}

class User {

    int id;
    String FullName;
    String NickName;
    String PhonNumber;
    String Email;
    private String Password;
    String Address;
    String Package;

    User() {
    }

    public User(String FullName, String NickName, String PhonNumber, String Email, String Password, String Address, String Package) {
        this.FullName = FullName;
        this.NickName = NickName;
        this.PhonNumber = PhonNumber;
        this.Email = Email;
        this.Password = Password;
        this.Address = Address;
        this.Package = Package;
    }

    public User(String FullName, String NickName, String PhonNumber, String Email, String Password, String Address) {
        this.FullName = FullName;
        this.NickName = NickName;
        this.PhonNumber = PhonNumber;
        this.Email = Email;
        this.Password = Password;
        this.Address = Address;
    }

    private User(String P) {
        this.Package = P;
    }
}

    class Pkg {
        
        String pkg;
        String mbps;
        String Price;

        Pkg() {

        }

        Pkg(String pkg, String mbps,String Price) {
            this.pkg = pkg;
            this.mbps = mbps;
            this.Price = Price+"Tk";
        }
    }
    
    class Area{
        int id;
        String code;
        String area;
        
        Area(){
            
        }
        
        Area(int id, String code, String area){
            this.id=id;
            this.code=code;
            this.area=area;
        }
    }
