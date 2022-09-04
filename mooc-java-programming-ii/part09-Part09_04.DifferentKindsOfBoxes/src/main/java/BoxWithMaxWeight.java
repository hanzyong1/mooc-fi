
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private int maxWeight;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        int total = 0;
        for (Item i: this.items) {
            total += i.getWeight();
        }
        if (item.getWeight() + total > this.maxWeight) {
            return;
        } else {
            this.items.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        if (this.items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
