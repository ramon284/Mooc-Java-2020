
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random rand;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.rand = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        int i = 0;
        int random = 0;
        while(i < 7){
            random = this.rand.nextInt(40) + 1 ;
            if(numbers.contains(random)){
                continue;
            }
            numbers.add(random);
            i++;
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
        
    }

    public boolean containsNumber(int number) {
        if(numbers.contains(number)){
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LotteryRow other = (LotteryRow) obj;
        if (!Objects.equals(this.numbers, other.numbers)) {
            return false;
        }
        return true;
    }
    

}

