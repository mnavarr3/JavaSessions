package Example3;

public class Employee extends Person {

    double	hourlyWage = 8.5;
    double	hours;
    int 	id;

    public Employee(String name) {
        super(name); // call the constructor of the parent class. // this is required!
        System.out.println("Create Employee: " + name);
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void pay()
    {
        System.out.println("We will pay: "+hourlyWage*hours);
    }
}
