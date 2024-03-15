package AbstractFactory;

public class customerDriver {
    public static void main(String[] args) {
        Customer logan = new Customer("Logan","NoRestriction");
        System.out.println(logan);
        Customer tim = new Customer("Tim","NoRestriction");
        System.out.println(tim);

        Customer bob=new Customer("Bob","Paleo");
        System.out.println(bob);

        Customer alice=new Customer("Alice","Vegan");
        System.out.println(alice);

        Customer megan=new Customer("Megan","Vegan");
        System.out.println(megan);

        Customer milo= new Customer("Milo","NutAllergy");
        System.out.println(milo);

    }
}
