
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        ArrayList<String> list = new ArrayList();
        while(true){
            input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            list.add(input);
        }
    list.stream()
        .forEach(word -> System.out.println(word));            
    }

}
