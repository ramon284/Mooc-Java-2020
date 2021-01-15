
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int x = -1000;
        if(number1 > x){
            x = number1;
        }
        if(number2 > x){
            x = number2;
        }
        if(number3 > x){
            x = number3;
        }
        return x;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
    
    
}
