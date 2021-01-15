
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start(){
        String input = "";
        while(true){
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n"
                    + "3 - list jokes\n X - stop");
            input = scanner.nextLine();
            if(input.equals("1")){
                System.out.println("Write the joke to be added:");
                input = scanner.nextLine();
                jokes.addJoke(input);
                continue;
            }
            if(input.equals("2")){
                System.out.println(jokes.drawJoke());
                continue;
            }
            if(input.equals("3")){
                jokes.printJokes();
                continue;
            }
            if(input.equals("X")){
                break;
            }           
        }     
    }
}
