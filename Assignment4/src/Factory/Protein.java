package Factory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Protein extends Macronutrient{
    private static Protein protein;
    private Protein(){
        super.validFood = new HashSet<>(List.of("Fish","Chicken","Beef","Tofu"));
    }
    public static Protein singleton(){
        if(protein==null)
        {
            protein=new Protein();
        }
        return protein;
    }

}
