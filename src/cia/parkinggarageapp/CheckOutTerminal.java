package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CheckOutTerminal {

    private String businessName;
//    private DisplayScreen ds;
    private FeeCalculatorStrategy fcs;
    private ReceiptStrategyObject rso;
    
    public CheckOutTerminal(String ticketId, double hoursParked) {
        setFcs(fcs);
//        setRso(rso);
//        ds = new DisplayScreen();
    }
    
//    public final void customerFarewellMessage(double hoursParked, double feeOwed) {
//        ds.displayCustomerFarewellMessage(hoursParked, feeOwed);
//    }
    
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

    public final void printCustomerReceipt(String ticketId, String businessName, double hoursParked, double feeOwed) {
        System.out.println("Dear owner of ticket number " + ticketId + ", "
        + "thank you for parking at " + businessName + ". You have parked for " + hoursParked + 
                " and owe " + feeOwed + ".");
    }
    
    public final FeeCalculatorStrategy getFcs() {
        return fcs;
    }

    public final void setFcs(FeeCalculatorStrategy fcs) {
        this.fcs = fcs;
    }
    
//    public final ReceiptStrategyObject getRso() {
//        return rso;
//    }
//    
//    public final void setRso (ReceiptStrategyObject rso) {
//        this.rso = rso;
//    }
    
}
