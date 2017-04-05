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
    
    public abstract double minimumCharge();
    
    public abstract int paidTime();
    
    public abstract double additionalCharge();
    
    public abstract double additionalTime();
    
}
