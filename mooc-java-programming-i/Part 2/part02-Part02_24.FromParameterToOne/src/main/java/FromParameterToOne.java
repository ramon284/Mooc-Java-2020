

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(15);

    }
    
    public static void printFromNumberToOne(int number){
        while(number != 0){
            System.out.println(number);
            number--;
        }
    }

}
