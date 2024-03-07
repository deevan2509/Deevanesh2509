/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seatreservation;

/**
 *
 * @author Admin
 */
public class ConcertHall {
    private final boolean[] seats;

    public ConcertHall(int totalSeats) {
        this.seats = new boolean[totalSeats];
    }

    public synchronized boolean bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length || seats[seatNumber - 1]) {
            return false; 
        }
        seats[seatNumber - 1] = true; 
        return true;
    }

    public synchronized void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Booked" : "Available"));
        }
    }
}
