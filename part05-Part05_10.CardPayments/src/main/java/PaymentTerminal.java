
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    
    private static final double AFFORDABLE_COST = 2.50;
    private static final double HEARTY_COST = 4.30;


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
//        double affordableCost = 2.50;
        
        if(payment < AFFORDABLE_COST) {
            return payment;
        }
        
        this.money += AFFORDABLE_COST;
        this.affordableMeals++;
        return payment - AFFORDABLE_COST;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
//        double heartyCost = 4.30;
        
        if(payment < HEARTY_COST) {
            return payment;
        }
        
        this.money += HEARTY_COST;
        this.heartyMeals++;
        return payment - HEARTY_COST;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() < AFFORDABLE_COST) {
            return false;
        }
        
        card.takeMoney(AFFORDABLE_COST);
        this.affordableMeals++;
        return true;
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        if(card.balance() < HEARTY_COST) {
            return false;
        }
        
        card.takeMoney(HEARTY_COST);
        this.heartyMeals++;
        return true;
    }
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if(sum < 0) {
            return;
        }
        card.addMoney(sum);
        this.money += sum;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
