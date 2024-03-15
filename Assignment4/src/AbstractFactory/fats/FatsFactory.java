package AbstractFactory.fats;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FatsFactory {
    private static FatsFactory instance;
    public Fats getFats(String fat){
        switch(fat){
            case "Avocado":
                return new Avocado();
            case "Peanuts":
                return new Peanuts();
            case "SourCream":
                return new SourCream();
            case "Tuna":
                return new Tuna();
            default:
                return null;
        }
    }
    public Fats chooseFats(String diet){
        List<Fats> fats = new ArrayList<>();
        fats.add(getFats("Avocado"));
        fats.add(getFats("Peanuts"));
        fats.add(getFats("SourCream"));
        fats.add(getFats("Tuna"));

        Collections.shuffle(fats);
        for (Fats food:fats) {
            if(food.validDiets(diet)){
                return food;
            }
        }
        return null;
    }
    private FatsFactory(){}
    public static FatsFactory getInstance(){
        if(instance==null){
            instance=new FatsFactory();
        }
        return instance;
    }
}
