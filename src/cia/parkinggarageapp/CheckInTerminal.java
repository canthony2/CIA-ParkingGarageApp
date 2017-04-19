package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class CheckInTerminal {

    private String ticketId;
    private double hoursParked;
    private CheckOutTerminal cot;
    
    public final void newVehicle(String ticketId, double hoursParked, FeeCalculatorStrategy fcs) {
        //delegate finding fees to CheckOutTerminal
        cot = new CheckOutTerminal(ticketId, hoursParked, fcs);
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
