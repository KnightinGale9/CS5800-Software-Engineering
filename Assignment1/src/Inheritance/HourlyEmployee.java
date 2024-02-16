package Inheritance;

public class HourlyEmployee extends Employee{
    protected int wage;
    protected int hoursWorked;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,int wage,int hoursWorked)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.wage=wage;
        this.hoursWorked=hoursWorked;
    }
    public void setWage(int wage)
    {
        this.wage = wage;
    }
    public void setHoursWorked(int hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
    public int getWage()
    {
        return wage;
    }
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    @Override
    public String toString()
    {
        return String.format("%s, Employee: %-20s, wage: $%,d, HoursWorked: %d",super.toString(),"HourlyEmployee",wage,hoursWorked);
    }
}
