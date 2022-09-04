import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> items;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    public double weight() {
        double total = 0;
        for (Packable i: this.items) {
            total += i.weight();
        }
        return total;
    }
    
    public void add(Packable item) {
        double total = this.weight();
        if (item.weight() + total > this.capacity) {
            return;
        } else {
            this.items.add(item);
        }
    }
    
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
