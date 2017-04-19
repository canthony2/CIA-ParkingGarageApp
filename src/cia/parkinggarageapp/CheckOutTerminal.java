package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CheckOutTerminal {

    private String businessName;
    private Receipt receipt;
    
    public CheckOutTerminal(String ticketId, double hoursParked, FeeCalculatorStrategy fcs) {
        receipt = new Receipt();
    }
    
    public final void readTicket(String ticketId, double hoursParked) {
        receipt.printReceipt(ticketId, hoursParked);
    }
    
    public final void printBusinessReceipt() {
        receipt.printBusinessReceipt();
    }
    
    public String getBusinessName() {
        return businessName;
    }
    
    public final void setBusinessName(String businessName) {
        if(businessName == null || businessName.isEmpty()) {
            System.out.println("Unregistered Business Name");
        }
        else{
            this.businessName = businessName;
        }
    }
    
}
