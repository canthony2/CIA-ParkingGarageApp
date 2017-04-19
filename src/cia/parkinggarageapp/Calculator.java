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
public class Calculator {
    
    private FeeCalculatorStrategy fcs;

    public Calculator() {
        setFcs(fcs);
    }
    
    public final void beginCalculations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public final FeeCalculatorStrategy getFcs() {
        return fcs;
    }

    public final void setFcs(FeeCalculatorStrategy fcs) {
        this.fcs = fcs;
    }
    
}
