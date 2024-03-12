package Builder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PizzaBuilder {
    private ArrayList<String> toppings;
    private String pizzaSize;
    private static Set<String> validToppings;

    public PizzaBuilder()
    {
        toppings = new ArrayList<>();
        validToppings = PizzaBuilder.getValidToppings();
    }
    public PizzaBuilder addToppings(String topping){
        if(validToppings.contains(topping)) {
            this.toppings.add(topping);
        }
        return this;
    }
    public PizzaBuilder addAllToppings(String[] topping){
        for(String top: topping){
            if(validToppings.contains(top)) {
                this.toppings.add(top);
            }
        }
        return this;
    }
    public PizzaBuilder setPizzaSize(String pizzaSize){
        this.pizzaSize=pizzaSize;
        return this;
    }
    private static HashSet<String> getValidToppings(){
        HashSet<String> top = new HashSet<>();

        top.addAll(List.of("Pepperoni", "Sausage","Mushrooms","Bacon","Onions","ExtraCheese","Peppers",
                "Chicken","Olives","Spinach","Tomato and Basil","Beef","Ham","Pesto","Spicy Pork","Ham and Pineapple"));
        return top;
    }
    public Pizza createPizza(){
        return new Pizza(pizzaSize,toppings.toArray(new String[toppings.size()]));
    }

}