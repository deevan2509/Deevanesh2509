/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seatreservation;

/**
 *
 * @author Admin
 */
public class Customer extends Thread{
    private final int customerId;
    private final int preferredSeat;

    public Customer(int customerId, int preferredSeat) {
        this.customerId = customerId;
        this.preferredSeat = preferredSeat;
    }

    public int chooseSeat() {
        return preferredSeat;
    }

    public int getCustomerId() {
        return customerId;
    }
}
