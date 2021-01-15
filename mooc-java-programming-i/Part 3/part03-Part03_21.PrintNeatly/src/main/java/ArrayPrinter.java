
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        String output ="";
        if(array.length == 1){
            output = Integer.toString(array[0]);
            System.out.println(output);
            return;
        }
        int len = array.length;
        int i = 1;
        for(int x:array){
            output += x;
            
            if(i != len){
                output+=", ";
            }
            i++;
        }
        System.out.println(output);
    }
}
