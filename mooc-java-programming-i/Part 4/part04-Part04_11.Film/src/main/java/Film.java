public class Film {
    private String name;
    private int ageRating;
    
    public Film(String name, int age){
        this.name = name;
        this.ageRating = age;
    }
    
    public String name(){
        return this.name;
    }
    public int ageRating(){
        return this.ageRating;
    }
}
