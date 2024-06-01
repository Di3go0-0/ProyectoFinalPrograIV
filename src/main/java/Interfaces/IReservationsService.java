/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Models.Reservation;
import java.util.List;

public interface IReservationsService {
    
    public boolean create(Reservation reservation);
    public boolean update(Reservation reservation);
    public boolean delete(String roomId);
    public List<Reservation> listReservationUser(String idClient);
    public Reservation getReservationById(String reservationId);
    
    
}
