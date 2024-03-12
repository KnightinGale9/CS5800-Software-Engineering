package Builder;

public class LittleCaesars extends PizzaChain{
    public LittleCaesars(){
        super("Little Caesars");
    }
    public void makePizza(String size,String[] toppings){
        Pizza maker = new PizzaBuilder().setPizzaSize(size).addAllToppings(toppings).createPizza();
        super.setPizza(maker);
    }
}
