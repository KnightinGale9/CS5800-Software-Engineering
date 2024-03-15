package AbstractFactory.fats;

public class Avocado extends Fats{

    public Avocado(){
        super("Avocado");
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
