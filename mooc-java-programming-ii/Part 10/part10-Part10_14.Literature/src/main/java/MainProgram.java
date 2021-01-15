
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int input2 = Integer.valueOf(scanner.nextLine());
            books.add(new Book(input, input2));
        }
        
        System.out.println(books.size() + " books in total.\nBooks:");
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        for (Book book: books){
            System.out.println(book);
        }
//        books.stream()
//                .sorted((book1, book2) -> book1.getAge() - book2.getAge())
//                .sorted((book1, book2) -> book1.getName().compareTo(book2.getName()))
//                forEach(book -> System.out.println(book.getName()
//                + "(recommended for "+book.getAge()+ "year-olds or older"));
        
        
    }

}
