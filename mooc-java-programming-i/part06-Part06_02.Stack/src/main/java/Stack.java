/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;
    
    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.stacks.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public void add(String value) {
        this.stacks.add(0, value);
    }
    
    public ArrayList<String> values() {
        return this.stacks;
    }
    
    public String take() {
        String temp = this.stacks.get(0);
        this.stacks.remove(0);
        return temp;
    }
}
