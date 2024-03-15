package AbstractFactory.carbs;

public class Bread extends Carbs{
    public Bread(){
        super("Bread");
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
