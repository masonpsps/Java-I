/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Gauge {
    private int value;
    
    public Gauge() {
        this.value = 0;
    }
    
    public void increase() {
        this.value = Math.min(5, this.value + 1);
    }
    public void decrease() {
        this.value = Math.max(0, this.value - 1);
    }
    
    public int value() {
        return this.value;
    }
    public boolean full() {
        return value == 5;
    }
}
