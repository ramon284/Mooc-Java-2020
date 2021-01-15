
public class List<Type> {
    private Type[] values;
    private int max;

    public List(){
        this.values = (Type[]) new Object[10];
        this.max = 0;
    }
    
    public void add(Type value){
        if(this.max == this.values.length){
            grow();
        }
        
        this.values[this.max] = value;
        this.max++;
    }
    
    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.max--;
    }
    
    public void grow(){
        int newSize = max + max / 2;
        Type[] newlist = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++){
            newlist[i] = this.values[i];
        }
        this.values = newlist;
    }
    
    public int indexOfValue(Type value) {
        for (int i = 0; i < this.max; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }  
        return -1;
    }
    
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.max - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }   
    
    public boolean contains(Type value) {
    for (int i = 0; i < this.max; i++) {
        if (this.values[i].equals(value)) {
            return true;
        }
    }

    return false;
    }

    
    public Type value(int index) {
    if (index < 0 || index >= this.max) {
        throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.max + "]");
    }

    return this.values[index];
}
    
}
