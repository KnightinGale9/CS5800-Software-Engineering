package AbstractFactory.fats;

public abstract class Fats {
    private String food;
    public Fats(String food){
        this.food=food;
    }
    public abstract boolean validDiets(String diet);
    @Override
    public String toString() {
        return food;
    }
}
