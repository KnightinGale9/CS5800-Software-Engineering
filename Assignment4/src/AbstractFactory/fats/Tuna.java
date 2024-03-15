package AbstractFactory.fats;

public class Tuna extends Fats{
    public Tuna(){
        super("Tuna");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
//            case "NoRestriction":
//            case "NutAllergy":
//            case "Paleo":
//                return true;
            case "Vegan":
                return false;
            default:
                return true;
        }
    }
}