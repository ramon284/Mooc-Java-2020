
public class Hideout<T> {
    private T first;

    public Hideout(){
        
    }
    public void putIntoHideout(T toHide){
        this.first = toHide;
    }
    public T takeFromHideout(){
        if(first != null){
            T x = first;
            first = null;
            return x;
        }
        return null;
    }
    public boolean isInHideout(){
        if(first != null){
            return true;
        }
        return false;
    }
}
