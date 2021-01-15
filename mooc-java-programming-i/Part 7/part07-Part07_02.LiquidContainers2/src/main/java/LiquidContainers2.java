
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            //System.out.print("> ");
            System.out.println("First: "+first);
            System.out.println("Second: "+second);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("add")){
                first.add(Integer.parseInt(parts[1]));
            }   
            if (parts[0].equals("remove")){
                second.remove(Integer.parseInt(parts[1]));
            }
            if (parts[0].equals("move")){
                first.move(second, Integer.parseInt(parts[1]));
            }
            
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
