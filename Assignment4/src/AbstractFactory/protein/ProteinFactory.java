package AbstractFactory.protein;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProteinFactory {
    private static ProteinFactory instance;
    public Protein getProtein(String protein){
        switch(protein){
            case "Beef":
                return new Beef();
            case "Chicken":
                return new Fish();
            case "Fish":
                return new Chicken();
            case "Tofu":
                return new Tofu();
            default:
                return null;
        }
    }
    public Protein chooseProtein(String diet){
        List<Protein> protein = new ArrayList<>();
        protein.add(getProtein("Beef"));
        protein.add(getProtein("Chicken"));
        protein.add(getProtein("Fish"));
        protein.add(getProtein("Tofu"));

        Collections.shuffle(protein);
        for (Protein food:protein) {
            if(food.validDiets(diet)){
                return food;
            }
        }
        return null;
    }
    private ProteinFactory(){}
    public static ProteinFactory getInstance(){
        if(instance==null){
            instance=new ProteinFactory();
        }
        return instance;
    }
}
