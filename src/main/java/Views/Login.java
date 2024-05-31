
package Views;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import ConecctionDB.MongoDBConnection;
import Controllers.UserController;
import Models.User;


import static javax.swing.JOptionPane.INFORMATION_MESSAGE;



public class Login extends javax.swing.JFrame {

    private MongoDBConnection mongoConnection = new MongoDBConnection();
    private UserController userController;
    private User user;
    public Login() {
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false); // Hacer que la ventana no sea redimensionable
        
        mongoConnection.connect();
        userController = new UserController(mongoConnection);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        NameLogo = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Name = new javax.swing.JLabel();
        BackgroundLogo = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Password = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        LabelToRegister = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 50));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Images/logo.png"))); // NOI18N
        jPanel4.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 260, -1));

        NameLogo.setFont(new java.awt.Font("FiraCode Nerd Font Med", 0, 24)); // NOI18N
        NameLogo.setForeground(new java.awt.Color(255, 255, 255));
        NameLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Images/favicon.png"))); // NOI18N
        NameLogo.setText("My Hotel");
        jPanel4.add(NameLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 200, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 360, 10));

        Name.setBackground(new java.awt.Color(255, 255, 255));
        Name.setFont(new java.awt.Font("FiraCode Nerd Font Ret", 0, 36)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name.setText("My Hotel");
        jPanel4.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 260, -1));

        BackgroundLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/Images/city.png"))); // NOI18N
        BackgroundLogo.setText("jLabel3");
        jPanel4.add(BackgroundLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 260, 500));

        EmailLabel.setForeground(new java.awt.Color(0, 0, 0));
        EmailLabel.setText("Email");
        jPanel4.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setForeground(new java.awt.Color(102, 102, 102));
        Email.setBorder(null);
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        jPanel4.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 360, 30));

        PasswordLabel.setForeground(new java.awt.Color(0, 0, 0));
        PasswordLabel.setText("Password");
        jPanel4.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 360, 10));

        Password.setBackground(new java.awt.Color(255, 255, 255));
        Password.setForeground(new java.awt.Color(102, 102, 102));
        Password.setBorder(null);
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel4.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 236, 360, 30));

        LoginButton.setBackground(new java.awt.Color(0, 153, 255));
        LoginButton.setFont(new java.awt.Font("FiraCode Nerd Font Propo Med", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel4.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 40));

        LabelToRegister.setBackground(new java.awt.Color(255, 255, 255));
        LabelToRegister.setForeground(new java.awt.Color(0, 0, 0));
        LabelToRegister.setText("Don't have an account?");
        jPanel4.add(LabelToRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 140, -1));

        RegisterButton.setBackground(new java.awt.Color(0, 153, 255));
        RegisterButton.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 14)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        jPanel4.add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 110, 20));

        LoginLabel.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 36)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(0, 0, 0));
        LoginLabel.setText("Login");
        jPanel4.add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EmailActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed

    }//GEN-LAST:event_PasswordActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if (!mongoConnection.isConexionExitosa()) {
            showMessageDialog(null, "Data Base is not connected.", "Error", ERROR_MESSAGE);
            return;
        }

        if(allFields()){
            showMessageDialog(null, "All fields are required", "Error", ERROR_MESSAGE);
            return;
        }
        if(!checkUserExist()){
            disposeAndShowRegister();
            return;
        }
        if(!login()){
            showMessageDialog(null, "Password Incorrect.", "Error", ERROR_MESSAGE);
            return;
        }
        showMessageDialog(null, "Login Succesfully.", "Success", INFORMATION_MESSAGE);
        
        this.user = userController.getUser(Email.getText().trim());
        mongoConnection.close();
       
        disposeAndShowUserView();
        
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        mongoConnection.close();
        disposeAndShowRegister();
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void disposeAndShowRegister(){
        dispose();
        Register registerView = new Register();
        registerView.setVisible(true);
    }
    
    private void disposeAndShowUserView(){
        dispose();
        HomeView view = new HomeView(this.user);
        view.setVisible(true);
    }
   
    
    
    private boolean allFields(){
        String email = Email.getText().trim();  // Trimming spaces
        char[] passwordChars = Password.getPassword();

        return email.isEmpty() || passwordChars.length == 0;
    }
    private boolean checkUserExist(){
         if(userController.checkUserExistence(Email.getText().trim())){
             return true;
         }
            showMessageDialog(null, "User does not exist. Please register.", "Error", ERROR_MESSAGE);
         return false;
    }
    
    private boolean login(){
        String email = Email.getText().trim();  // Trimming spaces
        char[] passwordChars = Password.getPassword();
        String passwordString = new String(passwordChars);
                
        return userController.Login(email, passwordString);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLogo;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel LabelToRegister;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel NameLogo;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}