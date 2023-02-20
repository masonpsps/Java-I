
import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String running = "";
        System.out.println("File to read: ");
        String file = scanner.nextLine();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while(fileReader.hasNextLine()) {
                running += fileReader.nextLine() + "\n";
            }
            
            String[] pieces = running.split("\\n\\n");
                        
            System.out.println("Commands: \n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program\n"
                    + "find name - searches recipe by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient");
            
            while(true) {
                System.out.println("Enter command: ");
                String command = scanner.nextLine();
                if(command.equals("stop")) {
                    break;
                }
                
                if(command.equals("list")) {
                    System.out.println(list(pieces));
                } else if(command.equals("find name")) {
                    System.out.println("Searched word: ");
                    String searchFor = scanner.nextLine();
                    
                    System.out.println("Recipes: \n" + searchForName(pieces, searchFor));
                } else if(command.equals("find cooking time")) {
                    System.out.println("Max cooking time: ");
                    int maxTime = Integer.valueOf(scanner.nextLine());
                    
                    System.out.println("Recipes: \n" + searchForCookTime(pieces, maxTime));
                } else if(command.equals("find ingredient")) {
                    System.out.println("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    
                    System.out.println("Recipes: \n" + searchForIngredient(pieces, ingredient));
                }
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    
    public static String list(String[] recipes) {
        String result = "";
        for(String recipe : recipes) {
            result += formatRecipe(recipe);
        }
        
        return result;
    }
    
    public static String formatRecipe(String recipe) {
        String[] pieces = recipe.split("\n");
        
        return pieces[0] + ", cooking time: " + pieces[1] + "\n";
    }
    
    public static String[] getIngredients(String recipe) {
        String[] pieces = recipe.split("\n");
        String[] str = Arrays.copyOfRange(pieces, 2, pieces.length);
        
//        System.out.println(str);
        return str;
    }
    
    public static String searchForName(String[] recipes, String name) {
        String result = "";
        
        for(String recipe : recipes) {
            String[] pieces = recipe.split("\n");
            String recipeName = pieces[0];
            if(recipeName.contains(name)) {
                result += formatRecipe(recipe);
            }
        }
        
        if(!result.isEmpty()) {
            return result;
        }
        return name + " not found";
    }
    
    public static String searchForCookTime(String[] recipes, int cookingTime) {
        String result = "";
        
        for(String recipe : recipes) {
            String[] pieces = recipe.split("\n");
            if(Integer.valueOf(pieces[1]) <= cookingTime) {
                result += formatRecipe(recipe);
            }
        }
        
        if(!result.isEmpty()) {
            return result;
        }
        return "";
    }
    
    public static String searchForIngredient(String[] recipes, String ingredient) {
        String result = "";
        String str = "\n" + ingredient + "\n";
        
        for(String recipe : recipes) {
//            System.out.println(recipe);
//            if(recipe.contains(str)) {
//                result += formatRecipe(recipe);
//            }
//            System.out.println(Arrays.toString(getIngredients(recipe)));
            for(String ingr : getIngredients(recipe)) {
                if(ingr.equals(ingredient)) {
                    result += formatRecipe(recipe);
                    break;
                }
            }
        }
        
        if(!result.isEmpty()) {
            return result;
        }
        return "";
    }
}
