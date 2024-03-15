package AbstractFactory.protein;

public class Chicken extends Protein{
    public Chicken(){
        super("Chicken");
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
