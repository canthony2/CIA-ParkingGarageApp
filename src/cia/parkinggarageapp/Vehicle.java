/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cia.parkinggarageapp;

/**
 *
 * @author knyghtspup
 */
public class Vehicle {

    private CheckInTerminal cit;
    
    public final void newGarageVisit(String vehicleId, double hoursParked) {
        //vehicle id
            //pass vehicle id to check-in terminal
        cit = new CheckInTerminal(vehicleId, hoursParked);
    }

}
