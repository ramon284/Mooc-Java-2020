
import java.util.ArrayList;


public class ExerciseManagement {
    
    private ArrayList<String> exercises;
    private ArrayList<String> completedExercises;
    
    public ExerciseManagement(){
        this.exercises = new ArrayList<>();
        this.completedExercises = new ArrayList<>();
    }

    
    public ArrayList<String> exerciseList(){
        return this.exercises;
    }
    
    public void add(String x){
        this.exercises.add(x);
    }
    
    public void markAsCompleted(String exercise){
        this.completedExercises.add(exercise);
    }
    
    public boolean isCompleted(String exercise){
        return this.completedExercises.contains(exercise);
    }
}
