
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name:");
            String first = scanner.nextLine();
            if(first.equals("")){
                for(PersonalInformation x: infoCollection){
                    System.out.println(x.getFirstName() + " " + x.getLastName());  
                }
                
                break;
            }
            System.out.println("Last name:");
            String second = scanner.nextLine();
            System.out.println("Identification number:");
            String number = scanner.nextLine();
            infoCollection.add(new PersonalInformation(first, second, number));
            
        }

    }
}
