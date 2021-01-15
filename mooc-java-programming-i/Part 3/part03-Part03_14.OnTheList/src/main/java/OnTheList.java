
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }        
        System.out.println("Search for?");
        String compare = scanner.nextLine();
        String output = compare + " was not found!";
        for(String x: list){
            if(compare.equals(x)){
                output = compare+" was found!";
            }
        }
        System.out.println(output);

    }
}
