package Factory;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public abstract class Macronutrient {
    protected String food;
    protected Set<String> validFood;
    public String getValidFood(Set<String> restriction){
        Set<String> combination = new HashSet<>();
        for(String valid: validFood){
            if(!restriction.contains(valid))
            {
                combination.add(valid);
            }
        }
        int random = new Random().nextInt(combination.size());
        int i=0;
        for(String food: combination){
            if(i==random)
            {
                this.food=food;
            }
            i++;
        }
        return food;
    }
}
