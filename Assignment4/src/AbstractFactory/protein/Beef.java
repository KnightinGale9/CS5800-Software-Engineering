package AbstractFactory.protein;

public class Beef extends Protein{

    public Beef() {
        super("Beef");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
            case "Vegan":
                return false;
            default:
                return true;
        }
    }
}
