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
//        businessInfo.shareBusinessName();
    }

    public final void readTicket(String ticketId, double hoursParked) {
        receipt.printReceipt(ticketId, hoursParked);
    }
    
    public final void printBusinessReceipt() {
        receipt.printBusinessReceipt();
    }
    
}
