/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Panels;

import Views.Panels.RegisterPanel;
import Controllers.UserController;
import Models.User;
import Views.Authentication;
import Views.Home;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class LoginPanel extends javax.swing.JPanel {

    private UserController userController = new UserController();
    private User user;

    private JFrame parentFrame;


    public LoginPanel(JFrame parentFrame) {
        initComponents();
        initComponents();
        this.parentFrame = parentFrame;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginLabel = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        LoginButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(560, 440));
        setPreferredSize(new java.awt.Dimension(560, 440));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginLabel.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 36)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(0, 0, 0));
        LoginLabel.setText("Login");
        add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 50));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setForeground(new java.awt.Color(102, 102, 102));
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 360, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 360, 10));

        EmailLabel.setForeground(new java.awt.Color(0, 0, 0));
        EmailLabel.setText("Email");
        add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        PasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        PasswordLabel.setText("Password");
        add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 236, 360, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 360, 10));

        LoginButton.setBackground(new java.awt.Color(0, 153, 255));
        LoginButton.setFont(new java.awt.Font("FiraCode Nerd Font Propo Med", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed

        if(allFields()){
            showMessageDialog(null, "All fields are required", "Error", ERROR_MESSAGE);
            return;
        }
        if(!checkUserExist()){
            Authentication.ShowJPanel(new RegisterPanel());
            return;
        }
        if(!login()){
            showMessageDialog(null, "Password Incorrect.", "Error", ERROR_MESSAGE);
            return;
        }
        showMessageDialog(null, "Login Succesfully.", "Success", INFORMATION_MESSAGE);

        this.user = userController.getUserByEmail(Email.getText().trim());
        
        disposeAndShowUserView();
        

    }//GEN-LAST:event_LoginButtonActionPerformed
     private boolean allFields(){
        String email = Email.getText().trim();  // Trimming spaces
        char[] passwordChars = Password.getPassword();

        return email.isEmpty() || passwordChars.length == 0;
    }
    private boolean checkUserExist(){
         if(userController.userExist(Email.getText().trim())){
             return true;
         }
            showMessageDialog(null, "User does not exist. Please register.", "Error", ERROR_MESSAGE);
         return false;
    }
    
    private boolean login(){
        String email = Email.getText().trim();  // Trimming spaces
        char[] passwordChars = Password.getPassword();
        String passwordString = new String(passwordChars);
                
        return userController.login(email, passwordString);
    }
    
    
    private void disposeAndShowUserView(){
        parentFrame.dispose();
        Home view = new Home(this.user);
        view.setVisible(true);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
