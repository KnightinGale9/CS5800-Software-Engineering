package AbstractFactory.carbs;

public class Pistachio  extends Carbs{
    public Pistachio(){
        super("Pistachio");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
            case "NutAllergy":
                return false;
            default:
                return true;
        }
    }
}
