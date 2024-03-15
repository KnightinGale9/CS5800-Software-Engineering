package AbstractFactory;


import AbstractFactory.carbs.Carbs;
import AbstractFactory.fats.Fats;
import AbstractFactory.protein.Protein;

public class Customer {

    private String name;
    private String diet;
    private Carbs carbs;
    private Fats fats;
    private Protein protein;
    public Customer(String name,String diet){
        this.name=name;
        this.diet=diet;
        Macronutrients.getInstance().setMealPlan(this.diet);
        carbs= Macronutrients.getInstance().getCarbs();
        fats = Macronutrients.getInstance().getFats();
        protein = Macronutrients.getInstance().getProtein();
    }
    @Override
    public String toString(){
        return String.format("%s has a %s diet. I recommend the following foods: %s,%s, and %s",
                name,diet,carbs,fats,protein);

    }
}
