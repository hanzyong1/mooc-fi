import java.util.ArrayList;

public class Point {
    private ArrayList<Integer> points;
    
    public Point() {
        this.points = new ArrayList<>();
    }
    
    public void add(int point) {
        if (point < 0 || point > 100) {
            return;
        }
        this.points.add(point);
    }
    
    public double average() {
        int sum = 0;
        int count = 0;
        for (Integer i: this.points) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }
    
    public double averageOfPassingGrade() {
        int sum = 0;
        int count = 0;
        for (Integer i: this.points) {
            if (i >= 50) {
                sum += i;
                count++;
            }
        }
        return (double) sum / count;
    }
    
    public double passPercentage() {
        int count = 0;
        for (Integer i: this.points) {
            if (i >= 50) {
                count++;
            }
        }
        return (double) 100 * count / this.points.size();
    }
    
}
