
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList();
        list.add(-5);
        list.add(10);
        list.add(0);
        list.add(-2);
    }
    
    public static List<Integer> positive(List<Integer> numbers){
        ArrayList<Integer> values = numbers.stream()
                .filter(value -> value > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return values;
    }

}
