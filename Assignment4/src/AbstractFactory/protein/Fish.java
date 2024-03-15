package AbstractFactory.protein;

public class Fish extends Protein{
    public Fish(){
        super("Fish");
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
