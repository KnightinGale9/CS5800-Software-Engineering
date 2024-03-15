package Builder;

public abstract class PizzaChain {
    private String chainName;
    private Pizza pizza;
    public PizzaChain(String chainName){
        this.chainName=chainName;
    }
    protected void setPizza(Pizza pizza){
        this.pizza=pizza;
    }
    public void makePizza(String size,String[] toppings){
        this.pizza = new PizzaBuilder().setPizzaSize(size).addAllToppings(toppings).createPizza();
    }
    public void eat(){
         System.out.printf("%s: %s\n",chainName,pizza.toString());
    };

}
