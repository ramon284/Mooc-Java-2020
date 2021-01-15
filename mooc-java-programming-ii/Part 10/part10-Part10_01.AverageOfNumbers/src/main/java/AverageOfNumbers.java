
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        String input = "";
        while(true){
            input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            list.add(input);
        }
        
        double average = list.stream()
                .mapToInt(number -> Integer.valueOf(number))
                .average()
                .getAsDouble();

        System.out.println(average);
    }
}
