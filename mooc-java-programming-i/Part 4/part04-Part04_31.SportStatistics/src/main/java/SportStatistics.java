
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String file = scanner.nextLine();
        try (Scanner reader = new Scanner(Paths.get(file))){
            System.out.println("Team: ");
            String input = scanner.nextLine();

            
            
        }catch(Exception e){
            
        }
    }
    

}
