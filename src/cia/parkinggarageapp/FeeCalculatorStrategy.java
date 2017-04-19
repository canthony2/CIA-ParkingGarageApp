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
    
    public abstract double setMinimumCharge();
    public abstract double getMinimumCharge();
    
    public abstract int setPaidTime();
    public abstract int getPaidTime();
    
    public abstract double setAdditionalCharge();
    public abstract double getAdditionalCharge();
    
    public abstract double setAdditionalTime();
    public abstract double getAdditionalTime();
    
}
