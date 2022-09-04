
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int input = Integer.valueOf(scan.nextLine());
        
        if (input < 5000) {
            System.out.println("No tax!");
        } else if (input >= 5000 && input <= 25000) {
            double calc = 100 + (input - 5000) * 0.08;
            System.out.println("Tax: " + calc);
        } else if (input >= 25000 && input <= 55000) {
            double calc = 1700 + (input - 25000) * 0.1;
            System.out.println("Tax: " + calc);
        } else if (input >= 55000 && input <= 200000) {
            double calc = 4700 + (input - 55000) * 0.12;
            System.out.println("Tax: " + calc);
        } else if (input >= 200000 && input <= 1000000) {
            double calc = 22100 + (input - 200000) * 0.15;
            System.out.println("Tax: " + calc);
        } else if (input >= 1000000) {
            double calc = 142100 + (input - 1000000) * 0.17;
            System.out.println("Tax: " + calc);
        }
    }
}
