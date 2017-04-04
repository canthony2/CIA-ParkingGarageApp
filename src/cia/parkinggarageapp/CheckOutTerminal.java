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
    
    private Receipt reciept;
    
    public final void newCheckOut() {
        //make receipt
        //receipt in charge of finding how much customer owes
        reciept = new Receipt();
    }

    public final void calculateFee() {
        //calculate fee
        
    }

    public final void displayCustomerInformation() {
        //show how long customer has stayed and how much customer owes
        
    }

    public final void printReceipt() {
        //print customer receipt
        
    }

    public final void displayBusinessInformation() {
        //log totals on payments, tickets, and how long customers have stayed
        //log totals to make averages
        
    }

    public final void endCheckOut() {
        //output strategies
        
    }
    
}
