/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        
    }
    
    public void increase() {
        if (value >= 5) {
            value = 5;
        } else {
            value += 1;
        }
    }
    
    public void decrease() {
        if (value <= 0) {
            value = 0;
        } else {
            value -= 1;
        }
    }
    
    public int value() {
        return this.value;
    }
    
    public boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }
}
