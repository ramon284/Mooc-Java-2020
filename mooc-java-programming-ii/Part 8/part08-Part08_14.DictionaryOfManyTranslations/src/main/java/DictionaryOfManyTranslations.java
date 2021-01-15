
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> hash = new HashMap();

    public DictionaryOfManyTranslations(){
        this.hash = new HashMap();
    }
    public void add(String word, String translation){
        this.hash.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> newWord = this.hash.get(word);
        newWord.add(translation);
    }
    public ArrayList<String> translate(String word){
        for(String x:hash.keySet()){
            if(x.equals(word)){
                return hash.get(x);
            }
        }
        return new ArrayList<>();
    }
    public void remove(String word){
        hash.remove(word);
//        for(String x:hash.keySet()){
//            if(x.equals(word)){
//                hash.remove(word);
//            }
//        }
        
    }
}
