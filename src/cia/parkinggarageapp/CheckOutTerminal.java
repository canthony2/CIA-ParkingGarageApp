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
    private FeeCalculatorStrategy fcs;
    
    public CheckOutTerminal(String ticketId, double hoursParked) {
        setFcs(fcs);
        custReceipt = new CustomerReceipt();
        businessReceipt = new BusinessReceipt();
        ds = new DisplayScreen();
    }
    
    public final void customerFarewellMessage(double hoursParked, double feeOwed) {
        ds.displayCustomerFarewellMessage(hoursParked, feeOwed);
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

    public final FeeCalculatorStrategy getFcs() {
        return fcs;
    }

    public final void setFcs(FeeCalculatorStrategy fcs) {
        this.fcs = fcs;
    }
    
}
