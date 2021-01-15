
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Database db = new Database();
        
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("?");
            String input = scan.nextLine();
            if(input.equals("Add")){
                System.out.println("Name: ");
                String first = scan.nextLine();
                System.out.println("Name in Latin: ");
                String second = scan.nextLine();
                db.add(first, second);
                continue;
            }
            if(input.equals("Observation")){
                System.out.println("Bird? ");
                input = scan.nextLine();
                if(db.exists(input)){
                    db.observation(input);
                    continue;
                }else{
                    System.out.println("Not a bird!");
                    continue;
                }
            }
            if(input.equals("All")){
                db.all();
                continue;
            }
            if(input.equals("One")){
                System.out.println("Bird?");
                input = scan.nextLine();
                db.one(input);
                continue;
            }
            if(input.equals("Quit")){
                break;
            }
        }
    }
}
