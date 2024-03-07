/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seatreservation;

/**
 *
 * @author Admin
 */
public class terminal {
    private final ConcertHall concertHall;

    public terminal(ConcertHall concertHall) {
        this.concertHall = concertHall;
    }

    public void displaySeats() {
        concertHall.displaySeats();
    }

    public boolean bookSeat(int seatNumber) {
        return concertHall.bookSeat(seatNumber);
    }
    
}
