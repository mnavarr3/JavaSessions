public class PassString {
    public static void main(String[] args){

        String name = "Shakespeare";

        //displays the string in 'name'
        System.out.println("In main, the name is " + name);

       // changeName(name);

        //displays the string in 'name'
        //System.out.println("Back in main the name is " + name);

        calculateNameArea("Blue", 10, 5 );

    }
    /*public static void changeName (String str){

        str = "Dickens";

        //displays the string in 'str'
        System.out.println("In changeName, the name " + "is now " + str);
    }*/
    public static void calculateNameArea(String str, int w, int l){

        int area = w * l;
        System.out.println("The area of a rectangle named " + str +" is: " + area);
    }
}
