
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        
        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }
}
