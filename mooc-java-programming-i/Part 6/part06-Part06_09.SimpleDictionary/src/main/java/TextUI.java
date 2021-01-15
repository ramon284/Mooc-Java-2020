
import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simp;
    //private ArrayList<SimpleDictionary> simpleList;
    
    public TextUI(Scanner scanner, SimpleDictionary simp){
        this.scanner = scanner;
        this.simp = simp;
        //this.simpleList = new ArrayList<>();
        //simpleList.add(simp);
    }
    
    public void start(){
        String input;
        String word;
        String translation;
        while(true){
            System.out.println("Command:");
            input = scanner.nextLine();
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(input.equals("add")){
                System.out.println("Word:");
                word = scanner.nextLine();
                System.out.println("Translation");
                translation = scanner.nextLine(); 
                simp.add(word, translation);
                continue;
            }
            if(input.equals("search")){
                System.out.println("To be translated:");
                word = scanner.nextLine();
                translation = simp.translate(word);
                if(translation == null){
                    System.out.println("Word " + word + " was not found");
                    continue;
                }
                System.out.println("Translation: " + translation);
                continue;
            }
            
            System.out.println("Unknown command");
            
            
        }
    }
    
}
