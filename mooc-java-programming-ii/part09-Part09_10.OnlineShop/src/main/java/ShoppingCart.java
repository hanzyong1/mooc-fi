
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item(product, 1, price));
        }       
    }
    
    public int price() {
        int total = 0;
        for (Item i: this.cart.values()) {
            total += i.price();
        }
        return total;
    }
    
    public void print() {
        for (Item i: this.cart.values()) {
            System.out.println(i);
        }
    }
}
