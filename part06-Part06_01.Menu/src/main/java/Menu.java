
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String menu) {
        boolean unique = true;
        for(String meal : this.meals) {
            if(meal.equals(menu)) {
                unique = false;
            }
        }
        if(unique) {
            this.meals.add(menu);
        }
    }
    
    public void printMeals() {
        for(String meal : meals) {
            System.out.println(meal);
        }
    }
    
    public void clearMenu() {
        meals.clear();
    }
}
