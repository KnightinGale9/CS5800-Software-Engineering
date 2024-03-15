package AbstractFactory.carbs;

public class Lentils  extends Carbs{
    public Lentils(){
        super("Lentils");
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
