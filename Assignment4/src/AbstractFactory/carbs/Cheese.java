package AbstractFactory.carbs;

public class Cheese extends Carbs{
    public Cheese(){
        super("Cheese");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
//            case "NoRestriction":
//            case "NutAllergy":
//            case "Vegan":
//                return true;
            case "Paleo":
                return false;
            default:
                return true;
        }
    }
}
