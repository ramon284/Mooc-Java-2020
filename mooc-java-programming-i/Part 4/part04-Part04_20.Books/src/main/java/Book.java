public class Book {
    private int pages;
    private int publication;
    private String name;
    
    public Book(String name, int pages, int pub){
        this.name = name;
        this.pages = pages;
        this.publication = pub;
    }
    
    public String getName(){
        return this.name;
    }
    
    
    
    public String toString(){
        return this.name + ", " + this.pages +" pages, " + this.publication;
    }
}
