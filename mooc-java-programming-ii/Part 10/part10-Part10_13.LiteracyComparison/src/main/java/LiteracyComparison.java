
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {

        String file = "literacy.csv";
        
        try{
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .sorted((line1, line2) -> line1[5].compareTo(line2[5]))
                    .forEach(line -> System.out.println
                    (line[3]+" ("+line[4]+"), "+line[2].split(" ")[1]+", "+line[5])
                    );
        }catch(IOException e){
            System.out.println("oh nonononono");
        }
    }
}
