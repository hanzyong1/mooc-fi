
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> rows = new ArrayList<>();
        ArrayList<Country> countries = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Country(parts[2], parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
                    .forEach(i -> countries.add(i));                                
        } catch (Exception e) {
            System.out.println(e);
        }
        countries.stream().sorted((p1, p2) -> {
            if (p1.getPercent() > p2.getPercent()) {
                return 1;
            } else if (p1.getPercent() < p2.getPercent()) {
                return -1;
            } else {
                return 0;
            }
        }).forEach(p -> System.out.println(p));
    }
}
