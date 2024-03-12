package Factory;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
public class Customer {
    public static Macronutrient getFoodGroup(String type){
        switch(type){
            case "Carb":
                return Carbs.singleton();
            case "Fat":
                return Fats.singleton();
            case "Protein":
                return Protein.singleton();
            default:
                return null;
        }
    }
    private String customer;
    private String diet;
    private String carbs;
    private String fats;
    private String protein;

    public Customer(String customer, String diet){
        this.customer=customer;
        this.diet=diet;
        this.makeDietPlan(diet);
    }
    private void makeDietPlan(String diet){
        Set<String> restriction = new HashSet<>();

        switch(diet){
            case "NoRestriction":
                carbs=getFoodGroup("Carb").getValidFood(restriction);
                fats=getFoodGroup("Fat").getValidFood(restriction);
                protein=getFoodGroup("Protein").getValidFood(restriction);
                break;
            case "Paleo":
                restriction.addAll(List.of("Cheese","Bread","Lentils","Tofu","Sour Cream"));
                carbs=getFoodGroup("Carb").getValidFood(restriction);
                fats=getFoodGroup("Fat").getValidFood(restriction);
                protein=getFoodGroup("Protein").getValidFood(restriction);
                break;
            case "Vegan":
                restriction.addAll(List.of("Fish","Beef","Tuna","Chicken","Cheese","Sour Cream"));
                carbs=getFoodGroup("Carb").getValidFood(restriction);
                fats=getFoodGroup("Fat").getValidFood(restriction);
                protein=getFoodGroup("Protein").getValidFood(restriction);
                break;
            case "NutAllergy":
                restriction.addAll(List.of("Pistachio","Peanuts"));
                carbs=getFoodGroup("Carb").getValidFood(restriction);
                fats=getFoodGroup("Fat").getValidFood(restriction);
                protein=getFoodGroup("Protein").getValidFood(restriction);
                break;

            default:
        }
    }

    @Override
    public String toString() {
        return String.format("%s has a %s diet I recommend a Meal with %s,%s, and %s.",customer,diet,carbs,protein,fats);
    }
}
