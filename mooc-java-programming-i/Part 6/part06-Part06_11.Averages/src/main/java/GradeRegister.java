
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> baseGrades;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.baseGrades = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.baseGrades.add(points);
    }
    
    public double averageOfPoints(){
        if(baseGrades.isEmpty()){
            return -1;
        }
        int count = 0;
        for(int points: this.baseGrades){
            count += points;
        }
        return (1.0* count) / baseGrades.size();
    }

    public int numberOfGrades(int grade) {
        if(grades.isEmpty()){
            return -1;
        }
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
    
    public double averageOfGrades(){
        if(grades.isEmpty()){
            return -1;
        }
        int x = 0;
        for(int grade: grades){
            x += grade;
        }
        return (1.0 * x) / (grades.size());
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
