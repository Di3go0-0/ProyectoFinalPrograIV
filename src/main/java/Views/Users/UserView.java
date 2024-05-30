/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views.Users;

import Models.User;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
        
public class UserView extends javax.swing.JFrame {

    private User user;
    public UserView(User user) {
        initComponents();
        this.user = user;
        
        UserID.setText(user.getId());
        UserName.setText(user.getName());
        UserEmail.setText(user.getEmail());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UserID = new javax.swing.JLabel();
        UserName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        UserEmail = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        BookingsUser = new javax.swing.JMenu();
        BookingManager = new javax.swing.JMenuItem();
        History = new javax.swing.JMenuItem();
        Rooms = new javax.swing.JMenu();
        AllRooms = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserID.setBackground(new java.awt.Color(0, 0, 0));
        UserID.setForeground(new java.awt.Color(0, 0, 0));
        UserID.setText("User");
        jPanel1.add(UserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 250, -1));

        UserName.setBackground(new java.awt.Color(0, 0, 0));
        UserName.setForeground(new java.awt.Color(0, 0, 0));
        UserName.setText("User");
        jPanel1.add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 250, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("User");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 250, -1));

        UserEmail.setBackground(new java.awt.Color(0, 0, 0));
        UserEmail.setForeground(new java.awt.Color(0, 0, 0));
        UserEmail.setText("User");
        jPanel1.add(UserEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 250, 20));

        Menu.setBackground(new java.awt.Color(75, 202, 242));
        Menu.setForeground(new java.awt.Color(0, 0, 0));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Menu.setMargin(new java.awt.Insets(10, 10, 10, 10));
        Menu.setSelectionModel(null);

        BookingsUser.setText("Bookings");
        BookingsUser.setToolTipText("");

        BookingManager.setText("Bookings Manager");
        BookingManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingManagerActionPerformed(evt);
            }
        });
        BookingsUser.add(BookingManager);

        History.setText("History");
        History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryActionPerformed(evt);
            }
        });
        BookingsUser.add(History);

        Menu.add(BookingsUser);

        Rooms.setText("Rooms");

        AllRooms.setText("All Rooms");
        AllRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllRoomsActionPerformed(evt);
            }
        });
        Rooms.add(AllRooms);

        Menu.add(Rooms);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BookingManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingManagerActionPerformed
        // TODO add your handling code here:
        showMessageDialog(null, "Boking Manager", "Success", INFORMATION_MESSAGE);
    }//GEN-LAST:event_BookingManagerActionPerformed

    private void HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryActionPerformed
        showMessageDialog(null, "History", "Success", INFORMATION_MESSAGE);
    }//GEN-LAST:event_HistoryActionPerformed

    private void AllRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllRoomsActionPerformed

        showMessageDialog(null, "Rooms", "Success", INFORMATION_MESSAGE);
    }//GEN-LAST:event_AllRoomsActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AllRooms;
    private javax.swing.JMenuItem BookingManager;
    private javax.swing.JMenu BookingsUser;
    private javax.swing.JMenuItem History;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu Rooms;
    private javax.swing.JLabel UserEmail;
    private javax.swing.JLabel UserID;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
