
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input1 = scanner.nextLine();
            if(input1.equals("end")){
                break;
            }
            
            int input = Integer.valueOf(input1);
            
            System.out.println(input * input * input);
            
        }

    }
}
