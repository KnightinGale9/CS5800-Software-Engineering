package Factory;

import java.util.HashSet;
import java.util.List;

public class Carbs extends FoodGroups {
    private static Carbs instance =null;
    private Carbs(){
        super.validFood = new HashSet<>(List.of("Cheese","Bread","Lentils","Pistachio"));
    }
    public static Carbs getInstance(){
        if(instance ==null)
        {
            instance =new Carbs();
        }
        return instance;
    }



}
