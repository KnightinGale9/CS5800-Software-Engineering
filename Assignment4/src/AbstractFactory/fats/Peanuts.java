package AbstractFactory.fats;

public class Peanuts extends Fats{
    public Peanuts(){
        super("Peanuts");
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
