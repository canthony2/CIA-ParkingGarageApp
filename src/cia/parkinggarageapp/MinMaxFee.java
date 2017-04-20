/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cia.parkinggarageapp;

/**
 *
 * @author canthony2
 */
public class MinMaxFee implements FeeCalculatorStrategy {
    
    private double maxCharge;
    private double feeOwed;

    public MinMaxFee(double maxCharge) {
        setMaxCharge(maxCharge);
    }
    
    @Override
    public final double setMinimumTime(int minimumTime) {
        if(minimumTime < 1) {
            System.out.println("Please enter a whole digit number");
        }
        return minimumTime;
    }

    @Override
    public final double setBaseFee(double baseFee) {
        if(baseFee < .01) {
            System.out.println("Please enter a value within the minimum range");
        }
        return baseFee;
    }

    @Override
    public final double setAdditionalChargePerHour(double additionalChargePerHour) {
        if(additionalChargePerHour < .01) {
            System.out.println("Please enter a value within the minimum range");
        }
        return additionalChargePerHour;
    }
   
    @Override
    public final double getFeeOwed(double hoursParked, double additionalChargePerHour, int minimumTime, double baseFee) {
        if(hoursParked < 1 || additionalChargePerHour < .01 || minimumTime < 1 || baseFee < .01) {
            System.out.println("Invalid values detected: please go back and input correct values");
        }
        if(hoursParked > minimumTime && feeOwed < maxCharge) {
            return ((hoursParked - minimumTime) * additionalChargePerHour) + baseFee;
        }
        else if(hoursParked > minimumTime && feeOwed > maxCharge) { 
                return maxCharge;
            }
        else {
            return baseFee;
            }
        }
    
    public final double getMaxCharge() {
        return maxCharge;
    }

    public final void setMaxCharge(double maxCharge) {
        if(maxCharge < .01) {
            System.out.println("Please enter a value inside the minimum range");
        }
        this.maxCharge = maxCharge;
    }
   
}
