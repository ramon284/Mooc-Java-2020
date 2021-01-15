
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        System.out.println("First: " + first.contains()+"/100");
        System.out.println("Second: "+second.contains()+"/100");

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int number = Integer.valueOf(parts[1]);                
            


            if(parts[0].equals("add")){
                first.add(number);
                System.out.println("First: "+first.toString());
                System.out.println("Second: "+second.toString());
                continue;
            }
            if(parts[0].equals("move")){
                first.move(number, second);
                System.out.println("First: " + first+"/100");
                System.out.println("Second: "+second+"/100");
            }
            if(parts[0].equals("remove")){
                second.remove(number);
                System.out.println("First: " + first+"/100");
                System.out.println("Second: "+second+"/100");
            }

        }
    }

}
