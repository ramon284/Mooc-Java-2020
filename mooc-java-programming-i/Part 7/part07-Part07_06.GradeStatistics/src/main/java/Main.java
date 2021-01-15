
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grade = new Grades();
        System.out.println("Enter points totals, -1 stops:");
        int input;
        while(true){
            input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            grade.addGrade(input);
            
        }
        System.out.println(grade.toString());
    }
}
