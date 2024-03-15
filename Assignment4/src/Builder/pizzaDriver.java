package Builder;

import java.util.*;

public class pizzaDriver {
    public static void main(String[] args) {
        System.out.println("Create a driver program to create three pizzas one of each size with 3, 6, and 9 toppings to your" +
                "liking and eat() all of them");
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

        System.out.println("\n\nNow assume you purchased another two pizza chains, Little Caesars, and Dominos. \nYou want to" +
                " add them to your program following the rules mentioned above.\n" +
                "Create the following pizzas and eat() all of them:");

        PizzaChain[] pizzaHut2 = new PizzaChain[2];
        pizzaHut2[0] = new PizzaHut();
        pizzaHut2[0].makePizza("Large",toppingRandomizer(3));
        pizzaHut2[0].eat();
        pizzaHut2[1] = new PizzaHut();
        pizzaHut2[1].makePizza("Small",toppingRandomizer(2));
        pizzaHut2[1].eat();


        PizzaChain[] littleCaesars = new PizzaChain[2];
        littleCaesars[0] = new LittleCaesars();
        littleCaesars[0].makePizza("Medium",toppingRandomizer(8));
        littleCaesars[0].eat();
        littleCaesars[1] = new LittleCaesars();
        littleCaesars[1].makePizza("Small",toppingRandomizer(6));
        littleCaesars[1].eat();

        PizzaChain[] dominos = new PizzaChain[2];
        dominos[0] = new Dominos();
        dominos[0].makePizza("Small",toppingRandomizer(1));
        dominos[0].eat();
        dominos[1] = new Dominos();
        dominos[1].makePizza("Large",toppingRandomizer(3));
        dominos[1].eat();
    }
    public static String[] toppingRandomizer(int size){
        List top = new ArrayList(List.of("Pepperoni", "Sausage","Mushrooms","Bacon","Onions","ExtraCheese","Peppers",
                "Chicken","Olives","Spinach","Tomato and Basil","Beef","Ham","Pesto","Spicy Pork","Ham and Pineapple"));
        Collections.shuffle(top);
        return (String[]) top.subList(0,size).toArray(new String[size]);

    }
}
