
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;
    
    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        for (int i = 0; i < this.cards.size(); i++ ) {
            System.out.println(this.cards.get(i));
        }
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }
    
    public int sum() {
        int sum = 0;
        for (int i = 0; i < this.cards.size(); i++) {
            sum += this.cards.get(i).getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand hand) {
        if (this.sum() == hand.sum()) {
            return 0;
        } else if (this.sum() > hand.sum()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    public void sortBySuit() {
        BySuitInValueOrder temp = new BySuitInValueOrder();
        Collections.sort(this.cards, temp);
    }
}
