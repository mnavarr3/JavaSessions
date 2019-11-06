package Example4;

public class AnnoyingCustomer implements AllThingsConsidered, AlmostForgotAboutThat
{
    //implementation of method sayHello from Example4.AllThingsConsidered
    public void sayHello()
    {
        System.out.println("I will really annoy you.");
    }
    //implementation of method SayBye from MysecondInterface
    public void SayBye()
    {
        System.out.println("Thank you for your service.");
    }

    //we can have additional methods
    public double anotherMethod() {
        return 70;
    }
}
