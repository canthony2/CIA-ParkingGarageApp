package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CheckOutTerminal {

    private String businessName;
    private CustomerReceipt custReceipt;
    private BusinessReceipt businessReceipt;
    private DisplayScreen ds;
    
    public CheckOutTerminal(String ticketId, double hoursParked) {
        custReceipt = new CustomerReceipt();
        ds = new DisplayScreen();
        ds.displayCustomerFarewellMessage();
    }
    
    public final void readTicket(String ticketId, double hoursParked) {
        
    }
    
    public final void printReceipts() {
        custReceipt.printCustomerReceipt();
        businessReceipt.printBusinessReceipt();
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
