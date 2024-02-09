package inheritance;

public class BaseEmployee extends Employee{
    protected int baseSalary;
    public BaseEmployee(String firstName,String lastName,String SSN)
    {
        super(firstName,lastName,SSN);
    }
    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

}
