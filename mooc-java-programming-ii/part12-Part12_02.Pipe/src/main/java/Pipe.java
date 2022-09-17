
import java.util.ArrayList;
import java.util.List;


public class Pipe<T> {
    private List<T> values;
    
    public Pipe() {
        this.values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    }
    
    public T takeFromPipe() {
        if (this.values.isEmpty()) {
            return null;
        } else {
            T temp = this.values.get(0);
            this.values.remove(0);
            return temp;            
        }
    }
    
    public boolean isInPipe() {
        if (this.values.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
