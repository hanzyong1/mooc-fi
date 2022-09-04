
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "-42\n" + "24\n" + "42\n" + "72\n" + "80\n" + "52\n" + "-1\n";
        String input2 = "49\n" + "50\n" + "51\n" + "-1\n";
        //Scanner scanner = new Scanner(input2);
        Scanner scanner = new Scanner(System.in);
        Point points = new Point();
        Grade grades = new Grade();
        
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            points.add(point);
            grades.gradeDistribution(point);
        }        
        System.out.println("Point average (all): " + points.average());  
        if (Double.isNaN(points.averageOfPassingGrade())) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average(passing): " + points.averageOfPassingGrade());
        }
        System.out.println("Pass percentage: " + points.passPercentage()); 
        System.out.println(grades.stars());
    }
}
