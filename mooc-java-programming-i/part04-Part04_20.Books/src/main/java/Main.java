import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            
            books.add(new Book(title, pages, year));
        }
        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (Book book: books) {
                System.out.println(book);
            }
        } else if (input.equals("name")) {
            for (Book book: books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
