
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int input = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int x = 1;
        while(i <= input){
            x *= i;
            i++;
        }
        
        System.out.println("Factorial: " +x);
    }
    
    
}
