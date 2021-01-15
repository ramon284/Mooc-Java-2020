public class Book {
    private String name;
    private int ageRec;
    
    public Book(String name, int x){
        this.name = name;
        this.ageRec = x;
    }
    
    public int getAge(){
        return this.ageRec;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + " (recommended for "+this.ageRec
                +" year-olds or older)";
    }
    
}
