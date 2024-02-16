package Inheritance;

public class BaseEmployee extends Employee{
    protected int baseSalary;
    public BaseEmployee(String firstName,String lastName,String SSN,int baseSalary)
    {
        super(firstName,lastName,SSN);
        this.baseSalary=baseSalary;
    }
    public void setBaseSalary(int baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary()
    {
        return baseSalary;
    }


    @Override
    public String toString()
    {
        return String.format("%s, Employee: %-20s, BaseSalary: $%,d",super.toString(),"BaseEmployee",baseSalary);
    }
}
