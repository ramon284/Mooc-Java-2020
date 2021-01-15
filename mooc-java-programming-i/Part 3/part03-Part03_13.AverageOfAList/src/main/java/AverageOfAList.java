
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int sum = 0;
        for(int x: list){
            sum += x;
        }
        System.out.println("Average: " + 1.0* sum/list.size());

        // toteuta listan lukujen summan laskeminen tänne
        
    }
}
