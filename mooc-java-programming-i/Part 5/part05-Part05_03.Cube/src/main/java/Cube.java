public class Cube {
    private int edgeLength;
    
    
    public Cube(int edgeLength){
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        return edgeLength * edgeLength * edgeLength;
    }
    
    public String toString(){
        return "he length of the edge is " + edgeLength + " and the volume " + this.volume();
    }
    
}
