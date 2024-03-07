/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seatreservation;

/**
 *
 * @author Admin
 */
public class Clerk extends Thread{
    private final terminal terminal;
    private final Customer customer;

    public Clerk(terminal terminal, Customer customer) {
        this.terminal = terminal;
        this.customer = customer;
    }

    @Override
    public void run() {
        int seatNumber = customer.chooseSeat();
        boolean success = terminal.bookSeat(seatNumber);
        if (success) {
            System.out.println("Seat " + seatNumber + " booked successfully for customer " + customer.getCustomerId());
        } else {
            System.out.println("Seat " + seatNumber + " failed to book for customer " + customer.getCustomerId());
        }
    }
}

