public class switches {
    public static void main(String[] args){
        //else if versus nested if statement
        int x = 30;


        if (x>60){
            System.out.println("The value is > 60");
        }
        else if(x>50) {
            System.out.println("The value is > 60");
        }
        else{
            System.out.println("The value is <= 50");
        }



        //if else ladder
        int l = 20;

        if( l==10)
            System.out.println("l is 10");
        else if (l == 15)
            System.out.println("l is 15");
        else if (l == 20)
            System.out.println("l is 20");
        else
            System.out.println("not found");






        //Switch case: testing a variable for quality for certain cases, use for smaller range
        int i = 20;

        switch (i) {
            case 10:
                System.out.println("i is 10");
                break;
            case 15:
                System.out.println("i is 15");
                break;
            case 20:
                System.out.println("i is 20");
                break;
            default:
                System.out.println("i is not present");
                break;
        }
    }
}
