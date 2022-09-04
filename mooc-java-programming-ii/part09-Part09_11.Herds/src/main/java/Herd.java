
import java.util.ArrayList;
import java.util.List;


public class Herd implements Movable{
    private List<Movable> herds;
    
    
    public Herd() {
        this.herds = new ArrayList<>();
    }
    
    public String toString() {
        String temp = "";
        for (Movable i: this.herds) {
            temp += i.toString() + "\n";
        }
        return temp;
    }
    
    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }
    
    public void move(int x, int y) {
        for (Movable i: this.herds) {
            i.move(x, y);
        }
    }
}
