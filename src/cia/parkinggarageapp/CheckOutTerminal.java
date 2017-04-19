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
    private Calculator calc;
    
    public CheckOutTerminal(String ticketId, double hoursParked) {
        calc = new Calculator();
        custReceipt = new CustomerReceipt();
        businessReceipt = new BusinessReceipt();
        ds = new DisplayScreen();
    }
    
    public final void readTicketToStartCalculations(String ticketId, double hoursParked) {
        
    }
    
    
    
    public final void customerFarewellMessage() {
        ds.displayCustomerFarewellMessage();
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
