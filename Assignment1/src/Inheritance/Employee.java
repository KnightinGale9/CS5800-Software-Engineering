package Inheritance;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurityNumber;
    public Employee(){}
    protected Employee(String firstName,String lastName, String socialSecurityNumber)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
    }


    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber)
    {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }



    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }
    @Override
    public String toString()
    {
        return String.format("Name: %-20s, SSN:%s",firstName+" "+ lastName,socialSecurityNumber);
    }
}
