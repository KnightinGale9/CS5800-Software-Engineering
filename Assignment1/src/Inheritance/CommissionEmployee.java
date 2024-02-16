package Inheritance;

public class CommissionEmployee extends Employee{
    protected double commissionRate;
    protected int grossSalary;
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, int grossSalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate=commissionRate;
        this.grossSalary=grossSalary;
    }
    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate = commissionRate;
    }
    public void setGrossSalary(int grossSalary)
    {
        this.grossSalary = grossSalary;
    }
    public double getCommissionRate()
    {
        return commissionRate;
    }
    public int getGrossSalary()
    {
        return grossSalary;
    }
    @Override
    public String toString()
    {
        return String.format("%s, Employee: %-20s, ComissionRate: %.2f%%, GrossSalary: $%,d", super.toString(),"CommissionEmployee",commissionRate*100,grossSalary);
    }
}
