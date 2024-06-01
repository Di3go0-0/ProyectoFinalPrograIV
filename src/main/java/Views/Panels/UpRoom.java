/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Panels;

import ConecctionDB.MongoDBConnection;
import Controllers.RoomController;
import Models.Room;
import Views.Prueba;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Administrator
 */
public class UpRoom extends javax.swing.JPanel {

    private MongoDBConnection mongoConexion = new MongoDBConnection();
    private RoomController roomController;
    private Room room;
    private boolean isEdition = false;
    public UpRoom() {
        initComponents();
        mongoConexion.connect();
        
        roomController = new RoomController(mongoConexion);
    }
    public UpRoom(Room room) {
        initComponents();
        mongoConexion.connect();
        
        roomController = new RoomController(mongoConexion);
        isEdition = true;
        this.room = room;
        edition();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        NumberLabel = new javax.swing.JLabel();
        RoomNumber = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        RoomType = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        CapacityLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        RoomCapacity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RoomPrice = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        CreateButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(550, 420));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setText("New Room");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 50));

        NumberLabel.setBackground(new java.awt.Color(0, 0, 0));
        NumberLabel.setForeground(new java.awt.Color(0, 0, 0));
        NumberLabel.setText("Room Number");
        jPanel1.add(NumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 130, -1));

        RoomNumber.setBackground(new java.awt.Color(255, 255, 255));
        RoomNumber.setForeground(new java.awt.Color(102, 102, 102));
        RoomNumber.setBorder(null);
        RoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomNumberActionPerformed(evt);
            }
        });
        jPanel1.add(RoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 180, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Room Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 130, -1));

        RoomType.setBackground(new java.awt.Color(255, 255, 255));
        RoomType.setForeground(new java.awt.Color(102, 102, 102));
        RoomType.setBorder(null);
        RoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomTypeActionPerformed(evt);
            }
        });
        jPanel1.add(RoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 180, 10));

        CapacityLabel.setBackground(new java.awt.Color(0, 0, 0));
        CapacityLabel.setForeground(new java.awt.Color(0, 0, 0));
        CapacityLabel.setText("Room Capacity");
        jPanel1.add(CapacityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, 10));

        RoomCapacity.setBackground(new java.awt.Color(255, 255, 255));
        RoomCapacity.setForeground(new java.awt.Color(102, 102, 102));
        RoomCapacity.setBorder(null);
        RoomCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomCapacityActionPerformed(evt);
            }
        });
        jPanel1.add(RoomCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 180, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Price per Night");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 130, -1));

        RoomPrice.setBackground(new java.awt.Color(255, 255, 255));
        RoomPrice.setForeground(new java.awt.Color(102, 102, 102));
        RoomPrice.setBorder(null);
        RoomPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomPriceActionPerformed(evt);
            }
        });
        jPanel1.add(RoomPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 180, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 10));

        CreateButton.setBackground(new java.awt.Color(0, 153, 255));
        CreateButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomNumberActionPerformed

    private void RoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomTypeActionPerformed

    private void RoomCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomCapacityActionPerformed

    private void RoomPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomPriceActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
    
        if (allFields()) {
            showMessageDialog(null, "All fields are required", "Error", ERROR_MESSAGE);
            return;
        }

        if (isEdition) {
            updateRoom();
        } else {
            createRoom();
        }

        Prueba.ShowJPanel(new RoomsPanel(true));
    }//GEN-LAST:event_CreateButtonActionPerformed

    private boolean checkUserExist(){
         if(roomController.roomExist(RoomNumber.getText().trim())){
            return true;
         }
         return false;
    }
   
    
    private void createRoom() {
        Room room = new Room(RoomNumber.getText().trim(),
                            RoomType.getText().trim(),
                            RoomCapacity.getText().trim(),
                            RoomPrice.getText().trim());

        if (!roomController.create(room)) {
            showMessageDialog(null, "The room was not created", "Error", ERROR_MESSAGE);
            return;
        }

        showMessageDialog(null, "The room was created", "Success", INFORMATION_MESSAGE);
    }
    private void updateRoom() {
        Room room = new Room(this.room.getId(),
                            RoomNumber.getText().trim(),
                            RoomType.getText().trim(),
                            RoomCapacity.getText().trim(),
                            RoomPrice.getText().trim());

        if (!roomController.update(room)) {
            showMessageDialog(null, "The room was not updated", "Error", ERROR_MESSAGE);
            return;
        }

        showMessageDialog(null, "The room was updated", "Success", INFORMATION_MESSAGE);
    }
    private void edition(){
        RoomCapacity.setText(this.room.getCapacity());
        RoomNumber.setText(this.room.getNumber());
        RoomPrice.setText(this.room.getPriceNight());
        RoomType.setText(this.room.getType());
        CreateButton.setText("Edit");
        Title.setText("Update Room");
    }

    private boolean allFields() {
        String number = RoomNumber.getText().trim();
        String type = RoomType.getText().trim();
        String capacity = RoomCapacity.getText().trim();
        String price = RoomPrice.getText().trim();

        return number.isEmpty() || type.isEmpty() || capacity.isEmpty() || price.isEmpty();
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CapacityLabel;
    private javax.swing.JButton CreateButton;
    private javax.swing.JLabel NumberLabel;
    private javax.swing.JTextField RoomCapacity;
    private javax.swing.JTextField RoomNumber;
    private javax.swing.JTextField RoomPrice;
    private javax.swing.JTextField RoomType;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
