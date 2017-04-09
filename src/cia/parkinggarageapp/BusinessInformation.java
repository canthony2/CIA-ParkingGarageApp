package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class BusinessInformation {

    private String businessName;
    private CheckOutTerminal cot;
    
    public BusinessInformation(String ticketId, double hoursParked) {
        
    }

    public final void sendBusinessName(String businessName) {
        cot.retrieveBusinessName(businessName);
    }
    
    public String getBusinessName() {
        return businessName;
    }

    public final void setBusinessName(String businessName) {
        if(businessName == null || businessName.isEmpty()) {
            System.out.println("Name not registered: Please enter a certified name");
        }
        this.businessName = businessName;
    }
    
}
