public class IntroRecursion {
    public static void main(String[] args) {

        //calling our recursive function
        message(5);


    }

    //This is our recursive function
    public static void message(int n)
    {
        if (n > 0)
        {
            System.out.println("This is a recursive method and n is: " + n);
            message(n -1);
        }
    }

}
