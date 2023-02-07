
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros() + addition.euros(), this.cents() + addition.cents());
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros() < compared.euros()) {
            return true;
        }
        if(this.euros() == compared.euros() && 
                this.cents() < compared.cents()) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        int newEuro = this.euros() - decreaser.euros();
        int newCent = this.cents() - decreaser.cents();
        Money newMoney = new Money(newEuro, newCent);
        
        if(this.lessThan(decreaser)) {
            return newMoney = new Money(0, 0);
        }
        
        if(decreaser.cents() > this.cents()) {
            newEuro = Math.max(0, this.euros() - 1) - decreaser.euros();
            newCent = this.cents() + 100 - decreaser.cents();
//            newMoney = new Money(Math.max(0, this.euros() - 1), this.cents() + 100);
        }
//        else {
////           newMoney = new Money(this.euros() - decreaser.euros(), this.cents() - decreaser.cents()); 
//        }
        newMoney = new Money(newEuro, newCent);
        
        return newMoney;
    }
}
