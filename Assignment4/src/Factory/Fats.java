package Factory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Fats extends Macronutrient{
    private static Fats fats=null;

    private Fats(){
        super.validFood = new HashSet<>(List.of("Avocado","Sour Cream","Tuna","Peanuts"));
    }
    public static Fats singleton(){
        if(fats==null)
        {
            fats=new Fats();
        }
        return fats;
    }
}
