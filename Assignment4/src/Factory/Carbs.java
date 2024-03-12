package Factory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Carbs extends Macronutrient{
    private static Carbs carbs=null;
    private Carbs(){
        super.validFood = new HashSet<>(List.of("Cheese","Bread","Lentils","Pistachio"));
    }
    public static Carbs singleton(){
        if(carbs==null)
        {
            carbs=new Carbs();
        }
        return carbs;
    }



}
