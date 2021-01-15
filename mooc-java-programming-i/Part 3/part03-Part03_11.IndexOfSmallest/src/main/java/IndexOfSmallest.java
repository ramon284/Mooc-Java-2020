
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 9999){
                int y = 200000;
                for(int number: x){
                    if(number < y){
                        y = number;
                    }
                }
                System.out.println("Smallest number: " +y);
                System.out.println("Found at index: " + x.indexOf(y));
                
                break;
            }
            x.add(input);
            
        }

        
    }
}
