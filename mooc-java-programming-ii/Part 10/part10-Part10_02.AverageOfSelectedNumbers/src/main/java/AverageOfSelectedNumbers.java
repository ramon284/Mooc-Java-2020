
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

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
        System.out.println("Print the average of the negative or the positive number? (n/p)");
        String posOrNeg = scanner.nextLine();
        double average = 0.0;
        if(posOrNeg.equals("p")){
             average = list.stream()
                    .mapToInt(number -> Integer.valueOf(number))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();              
        }
        if(posOrNeg.equals("n")){
             average = list.stream()
                    .mapToInt(number -> Integer.valueOf(number))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();          
        }


        System.out.println(average);
    }
}
