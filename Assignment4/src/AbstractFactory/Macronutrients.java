package AbstractFactory;

import AbstractFactory.carbs.Carbs;
import AbstractFactory.carbs.CarbsFactory;
import AbstractFactory.fats.Fats;
import AbstractFactory.fats.FatsFactory;
import AbstractFactory.protein.Protein;
import AbstractFactory.protein.ProteinFactory;

public class Macronutrients {
    private static Macronutrients instance;
    private Carbs carbs;
    private Fats fats;
    private Protein protein;
    private Macronutrients(){}
    public void setMealPlan(String diet){
        carbs = CarbsFactory.getInstance().chooseCarbs(diet);
        fats = FatsFactory.getInstance().chooseFats(diet);
        protein = ProteinFactory.getInstance().chooseProtein(diet);
    }

    public static Macronutrients getInstance() {
        if(instance==null)
        {
            instance=new Macronutrients();
        }
        return instance;
    }

    public Carbs getCarbs() {
        return carbs;
    }

    public Fats getFats() {
        return fats;
    }

    public Protein getProtein() {
        return protein;
    }
}
