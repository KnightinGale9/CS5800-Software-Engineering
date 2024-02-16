package Inheritance;

public class SalariedEmployee extends Employee{
    protected int weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,int weeklySalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary=weeklySalary;
    }
    public void setWeeklySalary(int weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }
    public int getWeeklySalary()
    {
        return weeklySalary;
    }


    @Override
    public String toString()
    {
        return String.format("%s, Employee: %-20s, WeeklySalary: $%,d",super.toString(),"SalariedEmployee",weeklySalary);
    }
}
