package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CheckInTerminal {

    private String ticketId;
    private double hoursParked;
    private String businessName;
    private double feeOwed;
    private CheckOutTerminal cot;
    
    public final void newVehicle(String ticketId, double hoursParked) {
        //delegate finding fees to the calculator via the CheckOutTerminal
        cot = new CheckOutTerminal(ticketId, hoursParked);
    }
    
    public final void endVisit(MinMaxFee minMaxFee) {
        cot.printCustomerReceipt(ticketId, businessName, hoursParked, feeOwed);
    }
    
    public final String getTicketId() {
        return ticketId;
    }

    public final void setTicketId(String ticketId) {
        if(ticketId == null || ticketId.isEmpty()) {
            System.out.println("No Ticket ID Found: Please Enter a Ticket ID");
        }
        this.ticketId = ticketId;
    }

    public final double getHoursParked() {
        return hoursParked;
    }

    public final void setHoursParked(double hoursParked) {
        if(hoursParked < .01) {
            System.out.println("Please enter a digit within the minimum range");
        }
        else {
            this.hoursParked = hoursParked;
        }
    }

    public final String getBusinessName() {
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

    public final double getFeeOwed() {
        return feeOwed;
    }

}
