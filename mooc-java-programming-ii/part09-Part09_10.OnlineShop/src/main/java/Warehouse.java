
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;
    
    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product) {
        if (!this.stocks.containsKey(product)) {
            return false;
        } else if (this.stocks.get(product) <= 0) {
            return false;
        } else {
            int temp = this.stocks.get(product);
            temp --;
            this.stocks.put(product, temp);
            return true;
        }
    }
    
    public Set<String> products() {
        Set<String> temp = new HashSet<>();
        for (String i: this.prices.keySet()) {
            temp.add(i);
        }
        return temp;
    }
}
