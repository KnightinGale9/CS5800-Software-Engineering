package Factory;

public class Customer {
    private String name;
    private String diet;
    private String[] dietPlan;

    public Customer(String customer,String diet){
        this.name=customer;
        this.diet=diet;
        Macronutrients.getInstance().makeDietPlan(diet);
        this.dietPlan = Macronutrients.getInstance().getDietPlan();
    }

    @Override
    public String toString() {
        String dietString = "[";
        for(String food: dietPlan){
            dietString+=food;
            dietString+= ", ";
        }
        dietString=dietString.substring(0,dietString.length()-2);
        dietString+="]";
        return String.format("%s has a %s diet. I recommend the following foods: %s",name,diet,dietString);
    }
}
