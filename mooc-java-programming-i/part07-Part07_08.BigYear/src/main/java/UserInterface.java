import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Bird> birds;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.birds = new ArrayList<>();
    }
    
    public void start() {
        while (true) {
            System.out.println("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");
                String latin = scanner.nextLine();
                this.add(name, latin);
            }
            if (input.equals("Observation")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                if (this.birdCheck(name)) {
                    this.observation(name);
                } else {
                    System.out.println("Not a bird!");
                }            
            }
            if (input.equals("All")) {
                System.out.println(this.print());
            }
            if (input.equals("One")) {
                System.out.println("Bird? ");
                String name = scanner.nextLine();
                System.out.println(this.one(name));
            }
        }        
    }
    
    public void add(String name, String latinName) {
        this.birds.add(new Bird(name, latinName));
    }
    
    public boolean birdCheck(String name) {
        for (Bird i: this.birds) {
            if (i.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void observation(String name) {
        for (Bird i: this.birds) {
            if (i.getName().equals(name)) {
                i.addObservation();
            }
        }
    }
    
    public String print() {
        String temp = "";
        for (Bird i: this.birds) {
            temp += i.toString();
        }
        return temp;
    }
    
    public String one(String name) {
        for (Bird i: this.birds) {
            if (i.getName().equals(name)) {
                return i.toString();
            }
        }
        return "";
    }
}
