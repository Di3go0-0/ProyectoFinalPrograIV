/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Panels;

import Models.User;
import javax.swing.table.DefaultTableModel;
import Controllers.ReservationController;
import Models.Reservation;
import Views.Home;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Administrator
 */
public class ReservationsPanel extends javax.swing.JPanel {
    private ReservationController reservationController = new ReservationController();
    private User user;
    public ReservationsPanel(User user) {
        initComponents();
        this.user = user;
        admin();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(550, 420));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "IdClient", "IdRoom", "# Number", "Date Entry", "Date Exit", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        Update.setBackground(new java.awt.Color(0, 153, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(0, 153, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        if(!optionButton("Update")){
            return;
        }
        
        if (jTable1.getSelectedRow() > -1) {
            String id = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
            Reservation reservation = reservationController.getReservationById(id);
            if (reservation != null) {
                Home.ShowJPanel(new Booking(reservation, this.user));
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Reservation not found.\n", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "You must select one or more rooms.\n", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if(!optionButton("Delete")){
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "You must select one or more Rooms to delete.\n", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    reservationController.delete((String) jTable1.getValueAt(i, 0));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void admin(){
        if(user.getTypeUser().equals("Admin")){
            LoadBookingsAdmin();
            Delete.setVisible(false);
            Update.setVisible(false);
            return;
        }
        LoadBookingsUser();
        Delete.setVisible(true);
        Update.setVisible(true);
    }


    private void LoadBookingsUser() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            reservationController.listReservationUser(this.user.getId()).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getIdClient(), u.getIdRoom(), u.getNumberRoom(),u.getDateEntry(), u.getDateExit(), u.getTotalPrice()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private void LoadBookingsAdmin() {
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            reservationController.listReservationAdmin().forEach((u) -> model.addRow(new Object[]{u.getId(), u.getIdClient(), u.getIdRoom(), u.getNumberRoom(),u.getDateEntry(), u.getDateExit(), u.getTotalPrice()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    private boolean optionButton(String deleteUpdate){
        String DataEntry = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 4);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate reservationDate = LocalDate.parse(DataEntry, formatter);
        LocalDate now = LocalDate.now();

        if (reservationDate.isBefore(now)) {
            showMessageDialog(null, "Cannot "+deleteUpdate+" the reservation because it has already passed", "Error", ERROR_MESSAGE);
            return false;
        }

        if (reservationDate.isAfter(now.plusDays(10))) {
            showMessageDialog(null, "Cannot "+deleteUpdate+" the reservation because it is within the stipulated period", "Error", ERROR_MESSAGE);
            return false;
        }

        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
