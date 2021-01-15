
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int begin = Integer.valueOf(scanner.nextLine());
        while(begin <= end){
            System.out.println(begin);
            begin++;
        }

        // Write your program here
    }
    
}
