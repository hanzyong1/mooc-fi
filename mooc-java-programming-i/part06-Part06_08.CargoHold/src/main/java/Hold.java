import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase i: this.suitcases) {
            totalWeight += i.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        for (Suitcase i: this.suitcases) {
            totalWeight += i.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.suitcases) {
            suitcase.printItems();
        }
    }
}
