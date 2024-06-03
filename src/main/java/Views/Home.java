/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Views.Panels.*;
import java.awt.BorderLayout;
import javax.swing.JPanel;

import Models.User;

/**
 *
 * @author Administrator
 */
public class Home extends javax.swing.JFrame {

    private boolean isAdmin = false;
    private User user;
    
    public Home(User user) {
        initComponents();
        setLocationRelativeTo(null);
        this.user = user;
        switchPanel(new HomePanel());
    
        
        
        setInitialConfig();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Navigation = new javax.swing.JPanel();
        MyHotel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Option1 = new javax.swing.JButton();
        Option2 = new javax.swing.JButton();
        Image = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Welcome = new javax.swing.JPanel();
        WelcomeLabel = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();
        LogoutPanel = new javax.swing.JPanel();
        Logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Navigation.setBackground(new java.awt.Color(75, 184, 220));
        Navigation.setForeground(new java.awt.Color(6, 134, 190));

        MyHotel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MyHotel.setForeground(new java.awt.Color(255, 255, 255));
        MyHotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MyHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/images/favicon.png"))); // NOI18N
        MyHotel.setText("My Hotel");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);

        Option1.setBackground(new java.awt.Color(6, 134, 190));
        Option1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Option1.setForeground(new java.awt.Color(255, 255, 255));
        Option1.setText("Rooms");
        Option1.setBorder(null);
        Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option1ActionPerformed(evt);
            }
        });

        Option2.setBackground(new java.awt.Color(6, 134, 190));
        Option2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Option2.setForeground(new java.awt.Color(255, 255, 255));
        Option2.setText("Reservations");
        Option2.setBorder(null);
        Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Option2ActionPerformed(evt);
            }
        });

        Image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/images/logo.png"))); // NOI18N

        Home.setBackground(new java.awt.Color(6, 134, 190));
        Home.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.setBorder(null);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavigationLayout = new javax.swing.GroupLayout(Navigation);
        Navigation.setLayout(NavigationLayout);
        NavigationLayout.setHorizontalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Option2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavigationLayout.createSequentialGroup()
                        .addComponent(MyHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavigationLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Option1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NavigationLayout.setVerticalGroup(
            NavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavigationLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(MyHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Image)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Option1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Option2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        Background.add(Navigation, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 250, 500));

        Welcome.setBackground(new java.awt.Color(6, 134, 190));

        WelcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        WelcomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        WelcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WelcomeLabel.setText("Welcome Diego");
        WelcomeLabel.setToolTipText("");

        TypeLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TypeLabel.setText("User");

        javax.swing.GroupLayout WelcomeLayout = new javax.swing.GroupLayout(Welcome);
        Welcome.setLayout(WelcomeLayout);
        WelcomeLayout.setHorizontalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(TypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(51, 51, 51))
        );
        WelcomeLayout.setVerticalGroup(
            WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WelcomeLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WelcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TypeLabel))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Background.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 440, 60));

        Content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        Background.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 550, 440));

        LogoutPanel.setBackground(new java.awt.Color(0, 93, 139));

        Logout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logout.setText("Logout");
        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LogoutPanelLayout = new javax.swing.GroupLayout(LogoutPanel);
        LogoutPanel.setLayout(LogoutPanelLayout);
        LogoutPanelLayout.setHorizontalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        LogoutPanelLayout.setVerticalGroup(
            LogoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        Background.add(LogoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        dispose();
        //Login view = new Login();
        Authentication view = new Authentication();
        view.setVisible(true);
        
    }//GEN-LAST:event_LogoutMouseClicked

    private void Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option1ActionPerformed
        switchPanel(new RoomsPanel(this.user));
    }//GEN-LAST:event_Option1ActionPerformed

    private void Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Option2ActionPerformed
        switchPanel(new ReservationsPanel(this.user));
    }//GEN-LAST:event_Option2ActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        switchPanel(new HomePanel());
    }//GEN-LAST:event_HomeActionPerformed

    private void switchPanel(JPanel panel) {
        panel.setSize(550, 420);
        panel.setLocation(0, 0);

        Content.removeAll();
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    
    
    
    private void setInitialConfig(){
        WelcomeLabel.setText("Welcome" + " " + this.user.getName() + "!");
        TypeLabel.setText(this.user.getTypeUser());
        
        if(user.getTypeUser().equals("Admin")){
            Option1.setText("Room Manager");
            Option2.setText("Bookings");
            isAdmin = true;
        }
        
    }
    
    public static void ShowJPanel(JPanel panel) {
        panel.setSize(550, 440);
        panel.setLocation(0, 0);

        Content.removeAll();
        Content.add(panel, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private static javax.swing.JPanel Content;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel Logout;
    private javax.swing.JPanel LogoutPanel;
    private javax.swing.JLabel MyHotel;
    private javax.swing.JPanel Navigation;
    private javax.swing.JButton Option1;
    private javax.swing.JButton Option2;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JPanel Welcome;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
