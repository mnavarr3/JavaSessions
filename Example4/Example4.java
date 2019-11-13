package Example4;

public class Example4 {


    public static void main(String[] args) {

        //Interfaces
        AnnoyingCustomer myAnnoyingCustomer = new AnnoyingCustomer();
        myAnnoyingCustomer.sayHello();
        myAnnoyingCustomer.SayBye();
        System.out.println(myAnnoyingCustomer.anotherMethod());

        //usage of static method defined in interface
        AllThingsConsidered.printStatic("This is static output");

        //just illustrating that one can also have subinterfaces

        SubInterfaceImplementation mySubObject = new SubInterfaceImplementation();
        mySubObject.SuperMethod1();
        mySubObject.SuperMethod2();
    }
}
