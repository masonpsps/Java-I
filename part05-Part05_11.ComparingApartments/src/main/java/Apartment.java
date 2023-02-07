
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int getPrice() {
        return this.squares * this.pricePerSquare;
    }
    
    public int priceDifference(Apartment compared) {
        return Math.abs(this.getPrice() - compared.getPrice());
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.getPrice() > compared.getPrice()) {
            return true;
        }
        return false;
    }
}
