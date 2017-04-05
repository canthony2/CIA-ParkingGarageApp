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
public class Ticket {

    private CheckOutTerminal cot;
    
    public Ticket(String vehicleId) {
        //pass vehicleId 
        cot = new CheckOutTerminal();
    }

    public final void logHoursParked(String ticketId, double hoursParked) {
        //
        
    }
    
}
