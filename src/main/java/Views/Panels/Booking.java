/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Views.Panels;

import Views.Home;
import Controllers.ReservationController;
import Models.Reservation;
import Models.Room;
import Models.User;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;

public class Booking extends javax.swing.JPanel {

    private Room room;
    private Reservation reservation;
    private ReservationController reservationController = new ReservationController();
    private User user;
    private boolean isEdition = false;
    
    public Booking(Room room, User user) {
        initComponents();
        this.room = room;
        this.user = user;
        
        RoomNumber.setText("Room number: " + room.getNumber());  
    }
    
     public Booking(Reservation reservation, Room room, User user) {
        initComponents();
        
        this.reservation = reservation;
        this.room = room;
        this.user = user;
        
        isEdition = true;
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
        RoomNumber = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        DateEnter = new javax.swing.JTextField();
        CapacityLabel = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        DateExit = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 420));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("FiraCode Nerd Font Mono SemBd", 0, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setText("Make a Reservation!");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, 50));

        RoomNumber.setBackground(new java.awt.Color(0, 0, 0));
        RoomNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RoomNumber.setForeground(new java.awt.Color(0, 0, 0));
        RoomNumber.setText("Room Number : #");
        jPanel1.add(RoomNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 130, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 180, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Date Enter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 130, -1));

        DateEnter.setBackground(new java.awt.Color(255, 255, 255));
        DateEnter.setForeground(new java.awt.Color(102, 102, 102));
        DateEnter.setBorder(null);
        DateEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateEnterActionPerformed(evt);
            }
        });
        jPanel1.add(DateEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 30));

        CapacityLabel.setBackground(new java.awt.Color(0, 0, 0));
        CapacityLabel.setForeground(new java.awt.Color(0, 0, 0));
        CapacityLabel.setText("Date Exit");
        jPanel1.add(CapacityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 10));

        DateExit.setBackground(new java.awt.Color(255, 255, 255));
        DateExit.setForeground(new java.awt.Color(102, 102, 102));
        DateExit.setBorder(null);
        DateExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateExitActionPerformed(evt);
            }
        });
        jPanel1.add(DateExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, 30));

        CreateButton.setBackground(new java.awt.Color(0, 153, 255));
        CreateButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CreateButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 120, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Remember: DD/MM/YYYY");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 240, 60));

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

    private void DateEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateEnterActionPerformed

    private void DateExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateExitActionPerformed

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

        Home.ShowJPanel(new RoomsPanel(this.user));
    }//GEN-LAST:event_CreateButtonActionPerformed
   
    private void createRoom() {
        String totalPrice = calculateReservationPrice(DateEnter.getText().trim(),
                                                     DateExit.getText(), 
                                                     room.getPriceNight());
        
        this.reservation = new Reservation(
                                user.getId(),
                                room.getId(),
                                room.getNumber(),
                                DateEnter.getText().trim(),
                                DateExit.getText().trim(),
                                totalPrice);

        if (!reservationController.create(reservation)) {
            showMessageDialog(null, "The room was not created", "Error", ERROR_MESSAGE);
            return;
        }

        showMessageDialog(null, "The room was created", "Success", INFORMATION_MESSAGE);
    }
    
    private void updateRoom() {
        String totalPrice = calculateReservationPrice(DateEnter.getText().trim(),
                                                     DateExit.getText(), 
                                                     room.getPriceNight());
        this.reservation.setDateEntry(DateEnter.getText().trim());
        this.reservation.setDateExit(DateExit.getText().trim());
        this.reservation.setPrice(totalPrice);

        if (!reservationController.update(this.reservation)) {
            showMessageDialog(null, "The room was not created", "Error", ERROR_MESSAGE);
            return;
        }

        showMessageDialog(null, "The room was created", "Success", INFORMATION_MESSAGE);
    }
    
    
    
    
    public String calculateReservationPrice(String DateEntry, String DateExit, String PriceNight) {
        // Definir el formato de fecha
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        // Convertir las cadenas de fecha a objetos LocalDate
        LocalDate entryDate = LocalDate.parse(DateEntry, formatter);
        LocalDate exitDate = LocalDate.parse(DateExit, formatter);
        
        // Calcular la diferencia en días entre las dos fechas
        long days = ChronoUnit.DAYS.between(entryDate, exitDate);
        
        // Convertir el precio por noche a entero
        int pricePerNight = Integer.parseInt(PriceNight);
        
        // Calcular el precio total
        int totalPrice = (int) (days * pricePerNight);
        
        // Devolver el resultado como una cadena
        return Integer.toString(totalPrice);
    }
    
    private void edition(){
        DateEnter.setText(reservation.getDateEntry());
        DateExit.setText(reservation.getDateExit());
        CreateButton.setText("Edit");
        Title.setText("Update Booking");
        RoomNumber.setText("Room number: " + room.getNumber());
    }
    
    private boolean allFields() {
        String type = DateEnter.getText().trim();
        String capacity = DateExit.getText().trim();

        return type.isEmpty() || capacity.isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CapacityLabel;
    private javax.swing.JButton CreateButton;
    private javax.swing.JTextField DateEnter;
    private javax.swing.JTextField DateExit;
    private javax.swing.JLabel RoomNumber;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
