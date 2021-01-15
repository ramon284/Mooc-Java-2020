
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        String input = "";
        
        while(true){
            System.out.println("Command:");
            input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            if(input.equals("add")){
                System.out.println("To add:");
                input = scanner.nextLine();
                list.add(input);
                continue;
            }
            if(input.equals("list")){
                list.print();
                continue;
            }
            if(input.equals("remove")){
                System.out.println("Which one is removed?");
                int input2 = Integer.valueOf(scanner.nextLine());
                list.remove(input2);
            }
        }
    }
}
