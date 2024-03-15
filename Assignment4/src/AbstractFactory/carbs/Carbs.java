package AbstractFactory.carbs;

public abstract class Carbs {
    private String food;
    public Carbs(String food){
        this.food=food;
    }
    public abstract boolean validDiets(String diet);

    @Override
    public String toString() {
        return food;
    }
}
