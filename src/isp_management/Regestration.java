package isp_management;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.JTextComponent;

public class Regestration extends javax.swing.JFrame {

    public Regestration() {
        initComponents();
        setHint(FullName, "Full Name");
        setHint(NickName, "User name");
        //setHint(PhoneNum, "01712345678");
        setHint(Email, "Exemple123@gmail.com");
        setHint(Address, "Division, Distric, Thana, Upazila, Post code, road no, house no");
    }

    private void setHint(JTextComponent textComponent, String hint) {
    textComponent.setText(hint);
    textComponent.setFont(textComponent.getFont().deriveFont(Font.ITALIC));
    textComponent.setForeground(Color.GRAY);

    textComponent.addFocusListener(new java.awt.event.FocusAdapter() {
        @Override
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (textComponent.getText().equals(hint)) {
                textComponent.setText("");
                textComponent.setFont(textComponent.getFont().deriveFont(Font.PLAIN));
                textComponent.setForeground(Color.BLACK);
            }
        }
        @Override
        public void focusLost(java.awt.event.FocusEvent evt) {
            if (textComponent.getText().isEmpty()) {
                textComponent.setText(hint);
                textComponent.setFont(textComponent.getFont().deriveFont(Font.ITALIC));
                textComponent.setForeground(Color.GRAY);
            }
        }
    });
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        NickName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();
        Password = new javax.swing.JPasswordField();
        Suggest = new javax.swing.JLabel();
        EmailSuggest = new javax.swing.JLabel();
        UNameSuggest = new javax.swing.JLabel();
        PhoneNum = new javax.swing.JFormattedTextField();
        Signin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(168, 185, 255));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Phone Number");

        FullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FullNameFocusLost(evt);
            }
        });
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Password");

        submit.setBackground(new java.awt.Color(0, 0, 153));
        submit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.setBorder(null);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 153, 255));
        jLabel12.setText("Regestration form");
        jLabel12.setAlignmentX(10.0F);
        jLabel12.setAlignmentY(5.0F);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane2.setViewportView(Address);

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Suggest.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        Suggest.setForeground(new java.awt.Color(51, 51, 51));
        Suggest.setText("Minimum 8 character");

        EmailSuggest.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        EmailSuggest.setText("Enter a valid mail");

        UNameSuggest.setFont(new java.awt.Font("Segoe UI", 2, 11)); // NOI18N
        UNameSuggest.setText("Unique username");

        try {
            PhoneNum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("01### ######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        Signin.setBackground(new java.awt.Color(0, 0, 153));
        Signin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Signin.setForeground(new java.awt.Color(255, 255, 255));
        Signin.setText("Signin");
        Signin.setBorder(null);
        Signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NickName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FullName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PhoneNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Suggest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                            .addComponent(EmailSuggest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UNameSuggest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Signin, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(UNameSuggest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(EmailSuggest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(Suggest, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Signin)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    public boolean isValidEmail(String email) {
    String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
    }
    
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(!isValidEmail(Email.getText())){
            EmailSuggest.setText("Please Insert a Valid Email");
            EmailSuggest.setForeground(Color.RED);
            return;
        }
        String pass = new String(Password.getPassword());
        if (pass == null) {
            Suggest.setText("Minimum 8 characters (Include at least one uppercase, one lowercase, one digit, and one special character)");
            return;
        } else {
            if(!checkPasswordStrength(pass, Suggest))
                return;
        }
        Database db = new Database();
        boolean Result = db.registration(FullName.getText(), NickName.getText(), PhoneNum.getText(), Email.getText(), Password.getText() , Address.getText());
        if (Result) {
            dispose(); 
            JOptionPane.showMessageDialog(null, "Account Created Successfully...", "Success", 3);
        } else {
            JOptionPane.showMessageDialog(null, "Fill the information correctly...", "Error", 3);
        }
    }                                      

    static boolean checkPasswordStrength(String password, JLabel lebel) {
    if (password.length() < 8) {
        lebel.setText("Password is too short (Minimum 8 characters)");
        lebel.setForeground(Color.RED);
        return false;
    } else {
        boolean containsLetter = false;
        boolean containsDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                containsLetter = true;
            } else if (Character.isDigit(c)) {
                containsDigit = true;
            }
        }

        if (containsLetter && containsDigit) {
            lebel.setText("Strong Password");
            lebel.setForeground(Color.BLUE);
            return true;
        } else {
            lebel.setText("Weak Password (Include at least one letter and one digit)");
            lebel.setForeground(Color.RED);
            return false;
        }
    }
}
    
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String pass = new String(Password.getPassword());
        if (pass == null) {
            Suggest.setText("Minimum 8 characters (Include at least one uppercase, one lowercase, one digit, and one special character)");
        } else {
            checkPasswordStrength(pass, Suggest);
        }
    }                                        

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void FullNameFocusGained(java.awt.event.FocusEvent evt) {                                     
        
    }                                    

    private void FullNameFocusLost(java.awt.event.FocusEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void SigninActionPerformed(java.awt.event.ActionEvent evt) {                                       
        dispose();
    }                                      

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(!isValidEmail(Email.getText())){
            EmailSuggest.setText("Please Insert a Valid Email");
            EmailSuggest.setForeground(Color.RED);
        }
        else{
            EmailSuggest.setText("Valid Email Address");
            EmailSuggest.setForeground(Color.BLUE);
        }
    }                                     

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea Address;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel EmailSuggest;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField NickName;
    private javax.swing.JPasswordField Password;
    private javax.swing.JFormattedTextField PhoneNum;
    private javax.swing.JButton Signin;
    private javax.swing.JLabel Suggest;
    private javax.swing.JLabel UNameSuggest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submit;
    // End of variables declaration                   
}
