package Factory;

import java.util.HashSet;
import java.util.List;

public class Fats extends FoodGroups {
    private static Fats instance =null;

    private Fats(){
        super.validFood = new HashSet<>(List.of("Avocado","Sour Cream","Tuna","Peanuts"));
    }
    public static Fats getInstance(){
        if(instance ==null)
        {
            instance =new Fats();
        }
        return instance;
    }
}
