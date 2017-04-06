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

    private String ticketId;
    private double hoursParked;
    private CheckOutTerminal cot;
    
    public final void startNewGarageVisit(String ticketId) {
        //pass ticketId to CheckOutTerminal
        cot = new CheckOutTerminal(ticketId);
    }

    public final void endGarageVisit(double hoursParked) {
        //have CheckOutTerminal read ticket to find hoursParked
        cot.readTicket(hoursParked);
    }
    
    public String getTicketId() {
        return ticketId;
    }

    public final void setTicketId(String ticketId) {
        if(ticketId == null || ticketId.isEmpty()) {
            System.out.println("No Ticket ID Found: Please Enter a Ticket ID");
        }
        this.ticketId = ticketId;
    }

    public double getHoursParked() {
        return hoursParked;
    }

    public final void setHoursParked(double hoursParked) {
        this.hoursParked = hoursParked;
    }

}
