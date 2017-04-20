package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CustomerReceipt implements ReceiptStrategyObject {

    public CustomerReceipt(String ticketId, String businessName, double hoursParked, double feeOwed) {
        printCustomerReceipt(ticketId, businessName, hoursParked, feeOwed);
    }
    
    @Override
    public final void setBusinessName(String businessName) {
        if(businessName == null || businessName.isEmpty()) {
            System.out.println("Please enter a valid business name");
        }
    }

    public final void printCustomerReceipt(String ticketId, String businessName, double hoursParked, double feeOwed) {
        System.out.println("Dear owner of ticket number " + ticketId + ", "
        + "thank you for parking at " + businessName + ". You have parked for " + hoursParked + 
                " and owe " + feeOwed + ".");
    }
    
}
