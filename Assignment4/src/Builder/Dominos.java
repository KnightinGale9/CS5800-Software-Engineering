package Builder;

public class Dominos extends PizzaChain{
    public Dominos(){
        super("Dominos");
    }
    public void makePizza(String size,String[] toppings){
        Pizza maker = new PizzaBuilder().setPizzaSize(size).addAllToppings(toppings).createPizza();
        super.setPizza(maker);
    }

}
