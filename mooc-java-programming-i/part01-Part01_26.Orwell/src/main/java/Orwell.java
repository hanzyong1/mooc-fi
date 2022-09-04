
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        if (input == 1984) {
            System.out.println("Orwell");
        }
    }
}
