
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } 
            if (input > 0) {
                sum += input;
                number += 1;
                continue;
            }
            if (input < 0) {
                continue;
            }
        }
        System.out.println((double) sum / number);
    }
}
