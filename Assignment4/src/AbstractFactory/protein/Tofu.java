package AbstractFactory.protein;

public class Tofu extends Protein{
    public Tofu(){
        super("Tofu");
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
