
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            int number = Integer.valueOf(input);
            int i = 0;
            int output = (int) Math.pow(number, 3);
            System.out.println(output);
            
        }

    }
}
