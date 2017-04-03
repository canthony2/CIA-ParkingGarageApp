package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//      Process
//          Start of Process
//              Check-In
//                  Vehicle drive up to automated check-in machine
//                  Automated check-in machine issues ticket
//                      Indicates time and date of check-in
//                  Kept in vehicle until check-out
//              Check-Out
//                  Vehicles drives up to automated check-out machine (if there is one)
//                  Insert ticket received when checking-in
//                  Automated machine reads time and date of check-in
//                  Using special formula
//                      Calculates time spent in garage (no more than 24 hours)
//                      Calculates fee owed
//                  Displays time spent and money owed on electronic display
//                  Payment provided in cash or credit
//                  Automated machine prints receipt
//          End of Process

        CheckInTerminal cit = new CheckInTerminal();
        CheckOutTerminal cot = new CheckOutTerminal();
        
        //Check-In
        cit.newCheckIn();
        cit.generateTicket();
        cit.endCheckIn();
        cot.newCheckOut();
        cot.readTicket();
        cot.displayCustomerInformation();
        cot.printReceipt();
        cot.displayBusinessInformation();
        cot.endCheckOut();
        
    }
    
}
