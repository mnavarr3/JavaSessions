public class OperatorsCont {
    public static void main(String[] args){
        int x = 10;

        //conditional operator: ?
        x=(x >0) ? 100 : (x> -10) ? (x> -3) ? -2 : 6 : -5;

        System.out.println(x);



        /*logical operators
                                         ||    means OR
                                         &&    means AND
                                         !     means NOT
                                         ^     means EXCLUSIVE OR  (if both true, it becomes false)
         */

        boolean a = false;
        boolean b = false;
        boolean c = true;
        boolean d = true;

        boolean result = !(((!a && b) || !(c || d) && !(a || d)) ^!(b^!a) );
        System.out.println("The result is:  " + result);

        boolean e = false;
        boolean f = false;
        boolean g = true;
        boolean h = true;

        boolean result2 = !(((!e && f) || !(g || h) && !(e || h)) ^!(f^!e) );
        boolean result3 = g ^ d;
        System.out.println("The 2nd result is:  " + result2);
        System.out.println("the 3rd result is: " + result3);

        boolean newResult = a | c;
        System.out.println("The new result is: " + newResult);

        int y = 113;
        int z = 211;

        int intResult = y | z;
        System.out.println("The new intResult is: " + intResult);

        //Strings
        String s1 = "hi";
        String s2 = "Hi";
        String s3 = new String("Hi");

        boolean stringsAreTheSame = s1 == s2;
        boolean sTwoAndThreeAreTheSame = s2 ==s3;

        System.out.println("s1 is the same as s2 " +stringsAreTheSame);
        System.out.println("s2 is the same as " + sTwoAndThreeAreTheSame);
        System.out.println("My strings are: "+ s1+" "+s2+" "+ s3);

        boolean correctComparison = s1.equals(s3);
        System.out.println("s1 is the same as s3: " +correctComparison);


    }
}
