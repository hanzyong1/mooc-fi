import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String item = scanner.nextLine();
                this.list.add(item);
            }
            if (command.equals("list")) {
                this.list.print();
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int num = Integer.valueOf(scanner.nextLine());
                this.list.remove(num);
            }
        }
    }
}
