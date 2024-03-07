/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seatreservation;
/**
 *
 * @author Admin
 */

public class SeatReservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcertHall concertHall = new ConcertHall(10); 
        terminal terminal = new terminal(concertHall);

        Customer customer1 = new Customer(1, 10);
        Customer customer2 = new Customer(2, 10); 
        
        Clerk clerk1 = new Clerk(terminal, customer1);
        Clerk clerk2 = new Clerk(terminal, customer2);

        clerk1.start();
        clerk2.start();
        
        try {
            clerk1.join();
            clerk2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        terminal.displaySeats();
    }
}
