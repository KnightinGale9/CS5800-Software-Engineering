package Builder;

public class PizzaHut extends PizzaChain{

    public PizzaHut(){
        super("Pizza Hut");
    }
    public void makePizza(String size,String[] toppings){
        Pizza maker = new PizzaBuilder().setPizzaSize(size).addAllToppings(toppings).createPizza();
        super.setPizza(maker);
    }
}
