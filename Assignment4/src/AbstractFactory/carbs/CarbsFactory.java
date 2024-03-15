package AbstractFactory.carbs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarbsFactory {
    private static CarbsFactory instance;
    public Carbs getCarbs(String carb){
        switch(carb){
            case "Bread":
                return new Bread();
            case "Cheese":
                return new Cheese();
            case "Lentils":
                return new Lentils();
            case "Pistachio":
                return new Pistachio();
            default:
                return null;
        }
    }
    public Carbs chooseCarbs(String diet){
        List<Carbs> carbs = new ArrayList<>();
        carbs.add(getCarbs("Bread"));
        carbs.add(getCarbs("Cheese"));
        carbs.add(getCarbs("Lentils"));
        carbs.add(getCarbs("Pistachio"));

        Collections.shuffle(carbs);
        for (Carbs food:carbs) {
            if(food.validDiets(diet)){
                return food;
            }
        }
        return null;
    }
    private CarbsFactory(){}

    public static CarbsFactory getInstance(){
        if(instance==null){
            instance=new CarbsFactory();
        }
        return instance;
    }


}
