
import java.util.ArrayList;


public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double max = 0.0;
            for (double i: this.history) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        }
    }
    
    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double min = this.history.get(0);
            for (double i: this.history) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
    }
    
    public double average() {
        if (this.history.isEmpty()) {
            return 0.0;
        } else {
            double sum = 0.0;
            int count = 0;
            for (double i: this.history) {
                sum += i;
                count++;
            }
            return sum / count;
        }
    }
}
