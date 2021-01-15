
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        ArrayList<Integer> list = new ArrayList();
        while(true){
            input = Integer.valueOf(scanner.nextLine());
            if(input < 0){
                break;
            }
            list.add(input);
        }
    list.stream()
        .filter(value -> value >= 1 && value <= 5)
        .forEach(value -> System.out.println(value));
        
    }
}
