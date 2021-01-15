

public class Checker {

    
    public boolean isDayOfWeek(String string){
        String regex = "mon|tue|wed|thu|fri|sat|sun";
        if(string.matches(regex)){
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string){
        String x = ("a|e|o|i|u");
        return string.matches("(a|e|o|i|u)+");
    }
    
    public boolean timeOfDay(String string){
        return string.matches("([0-1][0-9]|[0-2][0-3]):[0-5][0-9]:[0-5][0-9]");
    }
}
