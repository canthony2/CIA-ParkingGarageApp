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
public class BusinessInformation {

    private String businessName;
    
    public BusinessInformation(String ticketId, double hoursParked) {
        
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
