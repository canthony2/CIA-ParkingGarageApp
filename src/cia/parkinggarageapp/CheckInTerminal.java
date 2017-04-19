package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CheckInTerminal {

    private String ticketId;
    private double hoursParked;
    private CheckOutTerminal cot;
    
    public final void newVehicle(String ticketId, double hoursParked) {
        //delegate finding fees to CheckOutTerminal's calculator
        cot = new CheckOutTerminal(ticketId, hoursParked);
    }

//    private final CheckOutTerminal calculateCustomerFee(double hoursParked, FeeCalculatorStrategy fcs) {
//        return fcs.calculateCustomerFee(hoursParked, fcs);
//    }
//    
//    private final CheckOutTerminal calculateBusinessTotals(double hoursParked, FeeCalculatorStrategy fcs) {
//        return fcs.calculateBusinessTotals(hoursParked, fcs);
//    }
    
    public final void endVisit() {
        
    }
    
    public String getTicketId() {
        return ticketId;
    }

    public final void setTicketId(String ticketId) {
        if(ticketId == null || ticketId.isEmpty()) {
            System.out.println("No Ticket ID Found: Please Enter a Ticket ID");
        }
        this.ticketId = ticketId;
    }

    public double getHoursParked() {
        return hoursParked;
    }

    public final void setHoursParked(double hoursParked) {
        this.hoursParked = hoursParked;
    }

}
