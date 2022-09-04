
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            for (int i = 0; i < pieces.length; i++) {
                if (Integer.valueOf(pieces[1]) > age) {
                    age = Integer.valueOf(pieces[1]);
                }
            }
        }
        System.out.println("Age of the oldest: " + age);
    }
}
