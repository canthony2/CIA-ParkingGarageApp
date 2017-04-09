package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class BusinessInformation {

    private String businessName;
    
    public BusinessInformation(String ticketId, double hoursParked) {
        
    }

//    public final void shareBusinessName() {
//        
//    }
    
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





//X rt xs oxkh shho ql yhun Zqo. Nuhrjh zxdh th zfxorsph rso jikhsziy.