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
    
    public CheckInTerminal(String vehicleId) {
        //pass vehicle id to ticket
        ticket = new Ticket(vehicleId);
    }

    public final void generateTicket(String vehicleId, double hoursParked) {
        //log hours parked
        ticket.logHoursParked(vehicleId, hoursParked);
    }

}
