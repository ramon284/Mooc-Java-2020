import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Title:");
            String first = scanner.nextLine();
            if(first.equals("")){
                System.out.println("What information will be printed?");
                first = scanner.nextLine();
                
                if(first.equals("name")){
                    for(Book x:books){
                        System.out.println(x.getName());
                    }
                    break;
                }else if(first.equals("everything")){
                    for(Book x:books){
                        System.out.println(x.toString());
                    }
                    break;
                }
                
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            int pub = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(first, pages, pub));
        }

    }
}
