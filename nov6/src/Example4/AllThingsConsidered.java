package Example4;

public interface AllThingsConsidered
{
    //function definition, no scope or body, no executing code!
    public void sayHello();

    //static methods (can have a body)
    public static void printStatic(String text)
    {
        System.out.println(text);
    }

    //default implementation - can have a body (available since Java 8)
    default void showNumber(int Number)
    {
        System.out.println(Number);
    }
}