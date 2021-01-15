
import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        // implement here your program that uses the class Item
        ArrayList<Item> items2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Name:");
            String x = scanner.nextLine();
            if (x.isEmpty()){
                break;
            }
            items2.add(new Item(x));
        }
        
        for (Item x : items2){
            System.out.println(x.toString());
        }

    }
}
