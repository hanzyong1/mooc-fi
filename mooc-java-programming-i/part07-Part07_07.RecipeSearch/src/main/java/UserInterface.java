
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {
    private Scanner scanner;
    private ArrayList<Recipe> recipes;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.recipes = new ArrayList<>();
    }
    
    public void start() {
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        this.read(file);
        System.out.println("");
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
        System.out.println("");
        while (true) {                                   
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println(this.list());
            }
            if (command.equals("find name")) {
                System.out.println(this.findName());
            }
            if (command.equals("find cooking time")) {
                System.out.println(this.findCookingTime());
            }
            if (command.equals("find ingredient")) {
                System.out.println(this.findIngredient());
            }
        }
        
    }

    public void read(String file) {
        try (Scanner scan = new Scanner(Paths.get(file))) {
        while (scan.hasNextLine()) {
            String row = scan.nextLine();
            if (row.isEmpty()) {
                continue;
            }
            String name = row;
            int time = Integer.valueOf(scan.nextLine());
            ArrayList<String> ingredients = new ArrayList<>();
            while (scan.hasNextLine()) {
                String ingredient = scan.nextLine();
                if (ingredient.isEmpty()) {
                    break;
                }
                ingredients.add(ingredient);
            } 
            recipes.add(new Recipe(name, time, ingredients));
        } 
    } catch (Exception e) {
        System.out.println(e);
    }
}
    public String list() {
        String temp = "";
        for (Recipe i: this.recipes) {
            temp += i.getName() + ", cooking time: " + i.getTime() + "\n";
        }
        return temp;
    }
    
    public String findName() {
        String temp = "";
        System.out.println("Searched word: ");
        String searched = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes:");
        for (Recipe i: this.recipes) {
            if (i.getName().contains(searched)) {
                temp += i.getName() + ", cooking time: " + i.getTime() + "\n";
            }
        }
        return temp;
    }
    
    public String findCookingTime() {
        String temp = "";
        System.out.println("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe i: this.recipes) {
            if (i.getTime() <= maxTime) {
                temp += i.getName() + ", cooking time: " + i.getTime() + "\n";
            }
        }
        return temp;
    }
    
    public String findIngredient() {
        String temp = "";
        System.out.println("Ingredient: ");
        String ingredient = scanner.nextLine();
        System.out.println("");
        System.out.println("Recipes: ");
        for (Recipe i: this.recipes) {
            if (i.getIngredients().contains(ingredient)) {
                temp += i.getName() + ", cooking time: " + i.getTime() + "\n";
            }
        }
        return temp;
    }
}
