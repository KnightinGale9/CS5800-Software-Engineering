package Polymorphism;

public class shipDriver {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0]= new Ship("Ship",2000);
        ships[1]=new CruiseShip("CruiseShip",2010,2500);
        ships[2]=new CargoShip("CargoShip",2020,5000);

        for(int i=0;i<ships.length;i++)
        {
            System.out.println(ships[i]);
        }
    }
}
