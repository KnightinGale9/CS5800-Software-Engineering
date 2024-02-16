package Polymorphism;

public class CruiseShip extends Ship{
    protected int passengers;
    public CruiseShip(String shipName, int year,int passengers)
    {
        super(shipName, year);
        this.passengers =passengers;
    }
    public void setPassengers(int passengers)
    {
        this.passengers = passengers;
    }

    public int getPassengers()
    {
        return passengers;
    }


    @Override
    public String toString()
    {
        return String.format("ShipName: %-10s, Maximum Number of Passengers:%d",super.shipName, passengers);
    }
}
