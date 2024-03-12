package Builder;

import java.util.*;

public class pizzaDriver {
    public static void main(String[] args) {

        PizzaChain[] pizzaHut = new PizzaChain[3];
        pizzaHut[0] = new PizzaHut();
        pizzaHut[0].makePizza("Small",toppingRandomizer(3));
        pizzaHut[0].eat();
        pizzaHut[1] = new PizzaHut();
        pizzaHut[1].makePizza("Medium",toppingRandomizer(6));
        pizzaHut[1].eat();
        pizzaHut[2] = new PizzaHut();
        pizzaHut[2].makePizza("Large",toppingRandomizer(9));
        pizzaHut[2].eat();


        PizzaChain[] littleCaesars = new PizzaChain[3];
        littleCaesars[0] = new LittleCaesars();
        littleCaesars[0].makePizza("Small",toppingRandomizer(3));
        littleCaesars[0].eat();
        littleCaesars[1] = new LittleCaesars();
        littleCaesars[1].makePizza("Medium",toppingRandomizer(8));
        littleCaesars[1].eat();
        littleCaesars[2] = new LittleCaesars();
        littleCaesars[2].makePizza("Large",toppingRandomizer(1));
        littleCaesars[2].eat();

        PizzaChain[] dominos = new PizzaChain[3];
        dominos[0] = new Dominos();
        dominos[0].makePizza("Small",toppingRandomizer(2));
        dominos[0].eat();
        dominos[1] = new Dominos();
        dominos[1].makePizza("Medium",toppingRandomizer(6));
        dominos[1].eat();
        dominos[2] = new Dominos();
        dominos[2].makePizza("Large",toppingRandomizer(3));
        dominos[2].eat();
    }
    public static String[] toppingRandomizer(int size){
        List top = new ArrayList(List.of("Pepperoni", "Sausage","Mushrooms","Bacon","Onions","ExtraCheese","Peppers",
                "Chicken","Olives","Spinach","Tomato and Basil","Beef","Ham","Pesto","Spicy Pork","Ham and Pineapple"));
        Collections.shuffle(top);
        return (String[]) top.subList(0,size).toArray(new String[size]);

    }
}
