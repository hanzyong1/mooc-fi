
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        int first = this.squares * this.princePerSquare;
        int second = compared.squares * compared.princePerSquare;
        if (first > second) {
            return first - second;
        } else {
            return second - first;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int first = this.squares * this.princePerSquare;
        int second = compared.squares * compared.princePerSquare;
        if (first > second) {
            return true;
        } else {
            return false;
        }
    }

}
