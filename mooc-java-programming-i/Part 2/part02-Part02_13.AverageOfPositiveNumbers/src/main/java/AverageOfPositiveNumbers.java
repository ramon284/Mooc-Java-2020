
import java.util.Scanner;

public class AverageOfPositiveNumbers{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if(number == 0 && count == 0){
                System.out.println("Cannot calculate the average");
                break;
            }
            if(number == 0){
                System.out.println("Average of the numbers: " + sum/count);
                break;
            }
            count = count + 1;
            sum = sum + number;
        }        
    }
}
