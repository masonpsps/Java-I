/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        if(this.balance - 2.60 < 0.0) {
            return;
        }
        this.balance -= 2.60;
    }
    
    public void eatHeartily() {
        if(this.balance - 4.60 < 0.0) { 
            return; 
        }
        this.balance -= 4.60;
    }
    
    public void addMoney(double amt) {
        if(amt < 0) {
            return;
        }
        this.balance = Math.min(150.0, this.balance + amt);
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
