
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());
        int i = 0;
        while(i <= input){
            System.out.println(i);
            i++;
        }
    }
}
