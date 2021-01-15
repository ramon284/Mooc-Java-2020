
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> pointList;
    private ArrayList<Integer> passingList;
    
    public Grades(){
        this.pointList = new ArrayList<>();
        this.passingList = new ArrayList<>();
    }
    
    public ArrayList<Integer> getPointList(){
        return pointList;
    }
    
    public ArrayList<Integer> getPassingList(){
        return passingList;
    }
    
    public void addGrade(int grade){
        if(grade < 0 || grade > 100){
            return;
        }
        if(grade >= 50){
            addGradePassing(grade);
        }
        this.pointList.add(grade);
    }
    
    public void addGradePassing(int grade){
        if(grade > 100){
            return;
        }
        this.passingList.add(grade);
    }
    
    public int sum(ArrayList<Integer> list){
        int sum = 0;
        for(int grade: list){
            sum += grade;
        }
        return sum;
    }
    
    
    public double average(ArrayList<Integer> list){
        int sum = sum(list);
        if(list.isEmpty()){
            return 0.0;
        }
        return (sum * 1.0) / list.size();
    }
    
    public double passPercentage(){
        System.out.println("passinglistSize   " + passingList.size());
        System.out.println("pointList size    " + pointList.size());
        return (1.0 * passingList.size() / pointList.size()) * 100;
    }
    
    public String gradeDist(){
        //String output = "";
        String zero = "";
        String one = "";
        String two = "";
        String three = "";
        String four = "";
        String five="";
        for(int x: pointList){
            if(x < 50){
                zero+= "*";
                continue;
            }if(x < 60){
                one+="*";
                continue;
            }if(x<70){
                two+="*";
                continue;
            }if(x<80){
                three+="*";
                continue;
            }if(x<90){
                four+="*";
                continue;
            }five+="*";
        }
        return "5: "+ five +"\n4: "+four+"\n3: "+three+"\n2: "+two+"\n1: "+one+"\n0: "+zero;
    }
    
    public String toString(){
        String output = "";
        if(this.average(pointList) == 0.0){
            output += "Point average (all): -\n";
        }else{
            output += "Point average (all): " + this.average(pointList) + "\n";
        }
        if(this.average(passingList) == 0.0){
            output += "Point average (passing): -\n";
        }else{
            output += "Point average (passing): " + this.average(passingList) + "\n";
        }
        output += "Pass percentage: " +this.passPercentage()+"\n" +gradeDist();
        
        return output;
    }
}
