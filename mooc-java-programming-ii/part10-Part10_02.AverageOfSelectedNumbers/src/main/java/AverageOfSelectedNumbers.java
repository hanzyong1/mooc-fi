
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }
        double positiveAvg = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(n -> n > 0)
                .average()
                .getAsDouble();
        
        double negativeAvg = inputs.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .filter(n -> n < 0)
                .average()
                .getAsDouble();
                
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("n")) {
            System.out.println("Average of the negative numbers: " + negativeAvg);
        } else if (input.equals("p")) {
            System.out.println("Average of the positive numbers: " + positiveAvg);
        }
    }
}
