package AbstractFactory.protein;

public class Beef extends Protein{

    public Beef() {
        super("Beef");
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
