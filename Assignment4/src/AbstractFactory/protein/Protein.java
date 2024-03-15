package AbstractFactory.protein;

public abstract class Protein {
    private String food;
    public Protein(String food){
        this.food=food;
    }
    public abstract boolean validDiets(String diet);
    @Override
    public String toString() {
        return food;
    }
}
