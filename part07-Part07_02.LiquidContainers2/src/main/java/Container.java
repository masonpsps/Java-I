/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Container {
    private int amount;
    
    public Container() {
        this.amount = 0;
    }
    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if(amount < 0 ) {
            return;
        }
        this.amount = Math.min(this.amount + amount, 100);
    }
    
    public void remove(int amount) {
        this.amount = Math.max(0, this.amount - amount);
    }
    
    public String toString() {
        return this.amount + "/100";
    }
}
