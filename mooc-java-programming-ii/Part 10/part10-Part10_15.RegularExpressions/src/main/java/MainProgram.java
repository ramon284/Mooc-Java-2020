
import java.util.Scanner;



public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String x = "incorrect.";
        Checker checker = new Checker();
        if(checker.isDayOfWeek(input) == true){
            x = "correct.";
        }
        System.out.println("The form is "+x);
    }
}
