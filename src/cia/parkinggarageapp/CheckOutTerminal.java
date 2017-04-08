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
public class CheckOutTerminal {

    private Receipt receipt;
    private FeeCalculatorStrategy fcs;
    private BusinessInformation businessInfo;
    
    public CheckOutTerminal(String ticketId, double hoursParked) {
        receipt = new Receipt(ticketId, hoursParked);
        businessInfo = new BusinessInformation(ticketId, hoursParked);
    }

    public final void readTicket(String ticketId, double hoursParked) {
        receipt.printReceipt();
    }
    
    public final void retrieveBusinessName() {
        
    }
    
}
