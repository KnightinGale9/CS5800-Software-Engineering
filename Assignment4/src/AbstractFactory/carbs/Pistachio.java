package AbstractFactory.carbs;

public class Pistachio  extends Carbs{
    public Pistachio(){
        super("Pistachio");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
//            case "NoRestriction":
//            case "NutAllergy":
//            case "Paleo":
//            case "Vegan":
//                return true;
            default:
                return true;
        }
    }
}
