import java.util.ArrayList;

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }
    
    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (" + this.totalWeight() + " kg)";
        } else if (this.items.size() == 1){
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
        }        
    }
    
    public void printItems() {
        for (Item i: this.items) {
            System.out.println(i);
        }    
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item: this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        int heavy = 0;
        Item temp = null;
        for (Item item: this.items) {
            if (item.getWeight() > heavy) {
                heavy = item.getWeight();
                temp = item;
            }
        }
        return temp;
    }
}
