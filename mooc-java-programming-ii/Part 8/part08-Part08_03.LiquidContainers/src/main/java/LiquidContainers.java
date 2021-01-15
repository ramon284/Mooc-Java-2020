
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        System.out.println("First: " + first+"/100");
        System.out.println("Second: "+second+"/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int number = Integer.valueOf(parts[1]);                
            


            if(parts[0].equals("add")){
            if(number <=0){
                continue;
            }
            first += number;
            if(first > 100){
                first = 100;
            }
                System.out.println("First: " + first+"/100");
                System.out.println("Second: "+second+"/100");
                continue;
            }
            if(parts[0].equals("move")){
                if(number <=0){
                    continue;
                }
                first -= number;
                if(first<0){
                    second += number + first;
                    first = 0;
                }else{
                    second += number;
                }
                if(second > 100){
                    second = 100;
                }
                System.out.println("First: " + first+"/100");
                System.out.println("Second: "+second+"/100");
            }
            if(parts[0].equals("remove")){
                if(number <= 0){
                    continue;
                }
                second -= number;
                if(second < 0){
                    second = 0;
                }
                System.out.println("First: " + first+"/100");
                System.out.println("Second: "+second+"/100");
            }

        }
    }

}
