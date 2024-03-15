package Factory;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Macronutrients {
    private static Macronutrients macronutrients = null;
    private String carbs;
    private String fats;
    private String protein;

    private Macronutrients(){

    }
    public static Macronutrients getInstance(){
        if(macronutrients==null)
        {
            macronutrients=new Macronutrients();
        }
        return macronutrients;
    }
    public static FoodGroups getFoodGroup(String type){
        switch(type){
            case "Carb":
                return Carbs.getInstance();
            case "Fat":
                return Fats.getInstance();
            case "Protein":
                return Protein.getInstance();
            default:
                return null;
        }
    }
    public void makeDietPlan(String diet){
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
                System.out.println("Not a valid diet option.");
        }
    }
    public String[] getDietPlan(){
        return new String[]{carbs,protein,fats};
    }
}
