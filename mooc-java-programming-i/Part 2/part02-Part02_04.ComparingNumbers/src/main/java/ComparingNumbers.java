
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        
        if(number > number2){
            System.out.println(number + " is greater than " +number2 +".");
        } else if(number < number2){
            System.out.println(number + " is smaller than " +number2 +".");
        } else{
            System.out.println(number + " is equal to "+ number2+".");
        }
    }
}
