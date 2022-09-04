import java.util.ArrayList;

public class OneItemBox extends Box{
    private ArrayList<Item> one;
    
    public OneItemBox() {
        this.one = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (this.one.isEmpty()) {
            this.one.add(item);
        } else {
            return;
        }
    }
    
    public boolean isInBox(Item item) {
        if (this.one.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
