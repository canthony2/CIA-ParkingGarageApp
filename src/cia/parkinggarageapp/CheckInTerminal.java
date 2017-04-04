/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CheckInTerminal {

    private Ticket ticket;
    
    public final void newCheckIn(String ticketId, double hoursParked) {
        //make ticket
        ticket = new Ticket(ticketId, hoursParked);
    }

    public final void endCheckIn() {
        //log ticket for Check-Out Terminal
        
    }
    
}
