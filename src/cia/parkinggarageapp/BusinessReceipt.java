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
public class BusinessReceipt implements ReceiptStrategyObject {
    
    private double totalHoursCharged;
    private double totalFeesCollected;

    @Override
    public void setBusinessName(String businessName) {
        if(businessName == null || businessName.isEmpty()) {
            System.out.println("Please enter a valid business name");
        }
    }
    
}
