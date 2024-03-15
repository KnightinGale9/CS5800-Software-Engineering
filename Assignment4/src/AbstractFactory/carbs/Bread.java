package AbstractFactory.carbs;

public class Bread extends Carbs{
    public Bread(){
        super("Bread");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
            case "Paleo":
                return false;
            default:
                return true;
        }
    }

}
