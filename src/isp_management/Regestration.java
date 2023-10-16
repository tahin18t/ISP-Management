package isp_management;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
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
        public void focusGained(java.awt.event.FocusEvent evt) {
            if (textComponent.getText().equals(hint)) {
                textComponent.setText("");
                textComponent.setFont(textComponent.getFont().deriveFont(Font.PLAIN));
                textComponent.setForeground(Color.BLACK);
            }
        }
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        NickName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        PhoneNum = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(168, 185, 255));

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

        PhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Address");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Email");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Suggest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Password)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NickName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PhoneNum, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FullName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(118, 118, 118))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        Database db = new Database();
        boolean Result = db.registration(FullName.getText(), NickName.getText(), PhoneNum.getText(), Email.getText(), Password.getText(), Address.getText());
        if (Result) {
            dispose();
            JOptionPane.showMessageDialog(null, "Account Created Successfully...", "Success", 3);
        } else {
            JOptionPane.showMessageDialog(null, "Fill the information correctly...", "Error", 3);
        }

    }//GEN-LAST:event_submitActionPerformed

    private void checkPasswordStrength(String password) {
    if (password.length() < 8) {
        Suggest.setText("Password is too short (Minimum 8 characters)");
        Suggest.setForeground(Color.RED);
    } else {
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;
        boolean containsSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUppercase = true;
            } else if (Character.isLowerCase(c)) {
                containsLowercase = true;
            } else if (Character.isDigit(c)) {
                containsDigit = true;
            } else {
                containsSpecialChar = true;
            }
        }

        if (containsUppercase && containsLowercase && containsDigit && containsSpecialChar) {
            Suggest.setText("Strong Password");
            Suggest.setForeground(Color.BLUE);
        } else {
            Suggest.setText("Weak Password (Include at least one uppercase, one lowercase, one digit, and one special character)");
            Suggest.setForeground(Color.RED);
        }
    }
}
    
    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        String pass = Password.getText();
        if (pass == null) {
            Suggest.setText("Minimum 8 characters (Include at least one uppercase, one lowercase, one digit, and one special character)");
        } else {
            checkPasswordStrength(pass);
        }
    }//GEN-LAST:event_PasswordActionPerformed

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void FullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FullNameFocusGained
        
    }//GEN-LAST:event_FullNameFocusGained

    private void FullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FullNameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameFocusLost

    private void PhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField NickName;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField PhoneNum;
    private javax.swing.JLabel Suggest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
