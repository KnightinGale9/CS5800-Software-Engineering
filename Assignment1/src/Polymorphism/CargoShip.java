package Polymorphism;

public class CargoShip extends Ship{
    protected int cargoCapacity;
    public CargoShip(String shipName, int year,int cargoCapacity)
    {
        super(shipName, year);
        this.cargoCapacity=cargoCapacity;
    }
    public void setCargoCapacity(int cargoCapacity)
    {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity()
    {
        return cargoCapacity;
    }

    @Override
    public String toString()
    {
        return String.format("ShipName: %-10s, Cargo Capacity:%d tons",shipName,cargoCapacity );
    }
}
