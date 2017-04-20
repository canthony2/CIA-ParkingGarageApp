package cia.parkinggarageapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author knyghtspup
 */
public interface FeeCalculatorStrategy {
    
    public abstract double setMinimumTime(int minimumTime);
    public abstract double setBaseFee(double baseFee);
    public abstract double setAdditionalChargePerHour(double additionalChargePerHour);
    
}
