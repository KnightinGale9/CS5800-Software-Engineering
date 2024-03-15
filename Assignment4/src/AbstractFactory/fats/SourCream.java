package AbstractFactory.fats;

public class SourCream extends Fats{
    public SourCream(){
        super("Sour Cream");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
            case "Vegan":
            case "Paleo":
                return false;
            default:
                return true;
        }
    }
}
