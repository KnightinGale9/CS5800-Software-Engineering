package AbstractFactory.fats;

public class Avocado extends Fats{

    public Avocado(){
        super("Avocado");
    }
    @Override
    public boolean validDiets(String diet){
        switch (diet){
            default:
                return true;
        }
    }
}
