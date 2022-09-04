import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }
            if (input.equals("add")) {
                System.out.println("To add:");
                String word = scanner.nextLine();
                this.list.add(word);
            }
            if (input.equals("list")) {
                this.list.print();
            }
            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int i = Integer.valueOf(scanner.nextLine());
                this.list.remove(i);
            }
        }
    }
    
}
