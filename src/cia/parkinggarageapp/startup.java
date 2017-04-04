package cia.parkinggarageapp;

import javax.swing.JOptionPane;

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
//                      Input hours parked
//                  Kept in vehicle until check-out
//              Check-Out
//                  Vehicles drives up to automated check-out machine
//                  Insert ticket received when checking-in
//                  Automated machine reads hours parked
//                      Using special formula
//                          Calculates time spent in garage (no more than 24 hours)
//                          Calculates fee owed
//                  Displays time spent and money owed on electronic display
//                  Automated machine prints receipt
//                  Automated machine logs total hours and total fee's for manager
//          End of Process

        CheckInTerminal cit = new CheckInTerminal();
        CheckOutTerminal cot = new CheckOutTerminal();
        
        //Check-In
        cit.newCheckIn("", 0.0);
        cit.endCheckIn();
        //Check-Out
        cot.newCheckOut();
        cot.displayCustomerInformation();
        cot.printReceipt();
        cot.displayBusinessInformation();
        cot.endCheckOut();
                
        //Check-In
        cit.newCheckIn("", 0.0);
        cit.endCheckIn();
        //Check-Out
        cot.newCheckOut();
        cot.displayCustomerInformation();
        cot.printReceipt();
        cot.displayBusinessInformation();
        cot.endCheckOut();
        
        //Check-In
        cit.newCheckIn("", 0.0);
        cit.endCheckIn();
        //Check-Out
        cot.newCheckOut();
        cot.displayCustomerInformation();
        cot.printReceipt();
        cot.displayBusinessInformation();
        cot.endCheckOut();
        
    }
    
}
