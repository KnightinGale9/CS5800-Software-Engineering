package Builder;

public class Pizza {
    private String pizzaSize;
    private String[] toppings;
    public Pizza(String pizzaSize,String[] toppings){
        this.pizzaSize=pizzaSize;
        this.toppings=toppings;
    }
    @Override
    public String toString(){
        String temp ="";
        for(int i=0;i<toppings.length;i++) {
            temp+= toppings[i];
            temp +=", ";
        }
        return String.format("%s pizza with %d toppings which are %s",pizzaSize,toppings.length,temp.substring(0,temp.length()-2));
    }

}
