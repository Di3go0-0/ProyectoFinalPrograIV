/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Administrator
 */
public class Reservation {
    private String id;
    private String idClient;
    private String idRoom;
    private String numberRoom;
    private String dateEntry;
    private String dateExit;
    private String totalPrice;
    private String priceNigth;

    public Reservation(String id, String idClient, String idRoom, String numberRoom, String dateEntry, String dateExit, String totalPrice, String priceNigth) {
        this.id = id;
        this.idClient = idClient;
        this.idRoom = idRoom;
        this.numberRoom = numberRoom;
        this.dateEntry = dateEntry;
        this.dateExit = dateExit;
        this.totalPrice = totalPrice;
        this.priceNigth = priceNigth;
    }

    public Reservation(String idClient, String idRoom, String numberRoom, String dateEntry, String dateExit, String price, String priceNigth) {
        this.idClient = idClient;
        this.idRoom = idRoom;
        this.numberRoom = numberRoom;
        this.dateEntry = dateEntry;
        this.dateExit = dateExit;
        this.totalPrice = price;
        this.priceNigth = priceNigth;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getPriceNigth() {
        return priceNigth;
    }

    public void setPriceNigth(String priceNigth) {
        this.priceNigth = priceNigth;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public String getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(String numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(String dateEntry) {
        this.dateEntry = dateEntry;
    }

    public String getDateExit() {
        return dateExit;
    }

    public void setDateExit(String dateExit) {
        this.dateExit = dateExit;
    }

}