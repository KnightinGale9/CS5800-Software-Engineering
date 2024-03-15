package Factory;

import java.util.HashSet;
import java.util.List;

public class Protein extends FoodGroups {
    private static Protein instance;
    private Protein(){
        super.validFood = new HashSet<>(List.of("Fish","Chicken","Beef","Tofu"));
    }
    public static Protein getInstance(){
        if(instance ==null)
        {
            instance =new Protein();
        }
        return instance;
    }

}
