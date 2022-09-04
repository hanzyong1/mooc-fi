import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            if (input.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            if (input.equals("search")) {
                System.out.println("To be translated:");
                String search = scanner.nextLine();
                if (dictionary.translate(search) == null) {
                    System.out.println("Word " + search + " was not found");
                    continue;
                }
                System.out.println("Translation: " + dictionary.translate(search));                
                continue;
            }
            System.out.println("Unknown command");
        }
        System.out.println("Bye bye!");
    }
}
