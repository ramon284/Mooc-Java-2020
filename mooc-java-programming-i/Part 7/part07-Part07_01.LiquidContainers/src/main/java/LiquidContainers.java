
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        
        
        while (true) {
            System.out.println("First: " +first+"/100");
            System.out.println("Second: "+second+"/100");
            System.out.print("> ");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("add")){
                int x = Integer.parseInt(parts[1]);
                if(x <0){
                    continue;
                }
                first += x;
                if(first > 100){
                    first = 100;
                    continue;
                }
                continue;
            }
            if (parts[0].equals("move")){
                int x = Integer.parseInt(parts[1]);
                first -= x;
                if(first < 0){
                    second += first + x;
                    first = 0;
                }else{
                    second += x;
                }
                if(second > 100){
                    second = 100;
                    continue;
                }
                continue;
            }
            
            if(parts[0].equals("remove")){
                int x = Integer.parseInt(parts[1]);
                second -= x;
                if(second < 0){
                    second = 0;
                    continue;
                }continue;
            }
            
            if (input.equals("quit")) {
                break;
            }

        }
            
        }
   

}
