import java.util.ArrayList;

public class Grade {
    private ArrayList<Integer> grades;
    
    public Grade() {
        this.grades = new ArrayList<>();
    }
    
    public void gradeDistribution(int point) {
        if (point < 0 || point > 100) {
            return;
        }
        if (point < 50) {
            this.grades.add(0);
        } else if (point < 60) {
            this.grades.add(1);
        } else if (point < 70) {
            this.grades.add(2);
        } else if (point < 80) {
            this.grades.add(3);
        } else if (point < 90) {
            this.grades.add(4);
        } else if (point <= 100) {
            this.grades.add(5);
        }
    }
    
    public ArrayList<Integer> getGrade() {
        return this.grades;
    }
    
    public String stars() {
        String temp = "";
        String stars = "";
        int number = 5;
        int starsCount = 0;
        for (int i = number; i >= 0; i--) {
            for (int j = 0; j < this.grades.size(); j++) {
                if (this.grades.get(j) == number) {
                    starsCount ++;
                }
            }
            for (int k = 0; k < starsCount; k++) {
                stars += "*";
            }
            temp += number + ": " + stars + "\n";
            stars = "";
            number --;
            starsCount = 0;
        }
        
        return temp;
    }
}
