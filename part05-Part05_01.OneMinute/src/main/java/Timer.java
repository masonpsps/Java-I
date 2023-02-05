/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Timer {
    private int seconds;
    private int hundredths;
    
    public Timer() {
        this.seconds = 0;
        this.hundredths = 0;
    }
    
    public String seconds() {
        if(this.seconds < 10) {
            return "0" + this.seconds;
        }
        
        return "" + this.seconds;
    }
    public String hundredths() {
        if(this.hundredths < 10) {
            return "0" + this.hundredths;
        }
        
        return "" + this.hundredths;
    }
    
    public String toString() {
        return seconds() + ":" + hundredths();
    }
    
    public void advance() {
        this.hundredths += 1;
        if(this.hundredths >= 100) {
            this.hundredths = 0;
            this.seconds += 1;
        }
        if(this.seconds >= 60) {
            this.seconds = 0;
            // advance minutes
        }
    }
}
