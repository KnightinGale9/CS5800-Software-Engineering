package Builder;

public abstract class PizzaChain {
    private String chainName;
    private Pizza pizza;
    public PizzaChain(String chainName){
        this.chainName=chainName;
    }
    public void makePizza(String size,String[] toppings){}
    protected void setPizza(Pizza pizza){
        this.pizza=pizza;
    }
    public void eat(){
         System.out.printf("%s: %s\n",chainName,pizza.toString());
    };

}
