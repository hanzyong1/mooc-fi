
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longestName = "";
        int nameLength = 0;
        int totalAge = 0;
        int count = 0;
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            String[] pieces = input.split(",");
            totalAge += Integer.valueOf(pieces[1]);
            count += 1;
            if (pieces[0].length() > nameLength) {
                nameLength = pieces[0].length();
                longestName = pieces[0];
            }
            
        }
        System.out.println("Longest name: " + longestName);  
        System.out.println("Average of the birth years: " + ((double) totalAge / count));
    }
}
