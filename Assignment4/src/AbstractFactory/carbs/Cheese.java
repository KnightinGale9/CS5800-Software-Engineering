package AbstractFactory.carbs;

public class Cheese extends Carbs{
    public Cheese(){
        super("Cheese");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
            case "Paleo":
            case "Vegan":
                return false;
            default:
                return true;
        }
    }
}
