
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Files to load: ");
        String file = scanner.nextLine();
        ArrayList<String> ingredientList = new ArrayList<>();
        ArrayList<Recipe> recipeList = new ArrayList<>();

        try(Scanner reader = new Scanner(Paths.get(file))){
            int i = 0;
            while(reader.hasNextLine()){
                String name = reader.nextLine();
                int minutes = Integer.valueOf(reader.nextLine());

                while(true){
                    String ingredient = reader.nextLine();
                    if(ingredient.equals("") || !(reader.hasNextLine())){
                        System.out.println(ingredientList);
                        recipeList.add(new Recipe(name, minutes));
                        for(String x:ingredientList){
                            recipeList.get(i).addIng(x);
                        }
                        ingredientList.clear();
                        i++;
                        break;
                    }
                    ingredientList.add(ingredient);
                }         
            }
            System.out.println("Commands:\nlist - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name");
            while(true){
                System.out.println("Enter command: ");
                String input = scanner.nextLine();
                
                if(input.equals("list")){
                    for(Recipe x: recipeList){
                        System.out.println(x.toString());
                    }
                    continue;
                }
                if(input.equals("find name")){
                    System.out.println("Searched word:");
                    String z = scanner.nextLine();
                    System.out.println("Recipes:");
                    for(Recipe x:recipeList){
                        if(x.getName().contains(z)){
                            System.out.println(x.toString());
                        }
                    }
                    continue;
                }
                if(input.equals("find cooking time")){
                    System.out.println("Max cooking time:");
                    int z = Integer.valueOf(scanner.nextLine());
                    System.out.println("Recipes:");
                    for(Recipe x:recipeList){
                        if(x.getMinutes() <= z){
                            System.out.println(x.toString());
                        }
                    }continue;
                }
                if(input.equals("find ingredient")){
                    System.out.println("Ingredient:");
                    String z = scanner.nextLine();
                    System.out.println("Recipes:");
                    for(Recipe x:recipeList){
                        if(x.checkIngredients(z) == true){
                            System.out.println(x.toString());
                        }
                    }continue;
                }
                if(input.equals("stop")){
                    break;
                }
        }
  
        }catch(Exception e){
                
                }
        
        
        
        



    }
}
