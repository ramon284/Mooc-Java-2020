
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int pw = Integer.valueOf(scan.nextLine());
        if (pw < 5000){
            System.out.println("No tax!");
        }else if (pw < 25000){
            System.out.println("Tax: " + (100 + (pw-5000)*0.08));
        }else if (pw < 55000){
            System.out.println("Tax: " + (1700 + (pw-25000)*0.10));
        }else if (pw < 200000){
            System.out.println("Tax: " + (4700 + (pw-55000)*0.12));
        }else if(pw < 1000000){
            System.out.println("Tax: " + (22100 + (pw-200000)*0.15));
        }else{
            System.out.println("Tax: " + (142100 + (pw-1000000)*0.17));
        }
        
    }
}
