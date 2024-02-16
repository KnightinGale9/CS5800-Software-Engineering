package Polymorphism;

public class Ship {
    protected String shipName;
    protected int year;

    public Ship(String shipName,int year)
    {
        this.shipName=shipName;
        this.year=year;
    }


    public void setShipName(String shipName)
    {
        this.shipName = shipName;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public String getShipName()
    {
        return shipName;
    }

    public int getYear()
    {
        return year;
    }
    @Override
    public String toString()
    {
        return String.format("ShipName: %-10s, Year Built: %d",shipName,year);
    }
}
