public class ExampleProgram {

    public static void main(String[] args){
        Person anne = new Person("annie", 40);
        Person hubert = new Person("hubert");
        //cannot just type
        // Person peggy;
        //because it has not been correctly initialized like " Person peggy = new Person("peggy"); "
        int theThingIlikeToAdd =9;
        int andAnotherThing=2;
        Test one = new Test();
        Test two = new Test();

        //one.y =7;
        //one.x = 8;
        System.out.println("This is private x: "+ one.getX());
        System.out.println("This is private x two: "+ two.getX());
        int myValue = one.getX();       //declaring myValue with x, which is zero
        int myValue2 = two.getX();



        System.out.println(5+one.getX());
        System.out.println(one.createSum(theThingIlikeToAdd));
        System.out.println(one.createSum(theThingIlikeToAdd,andAnotherThing));

        double input = 7.2;
        System.out.println(one.createSum(input));


        int sum = 5 + myValue;              //5 + x=0
        int sumTwo= 5 + myValue2;

        one.setX(7);
        System.out.println("This is x: "+ one.getX());
        System.out.println("This is x: "+ two.getX());

        int sum2 = 5 + myValue;   //myValue is still zero so, 5+0

        System.out.println("These are sum of 'one' Test variables x and y: " + sum);
        System.out.println("These are sum of 'two' Test variables x and y: " + sumTwo);
        System.out.println("This is sum2: "+ sum2);

        one.doAnother();
        one.doAnother2();

        System.out.println(hubert.getName());//if hubert hadn't been set, the program will return 'null'
        System.out.println(anne.getName());

        anne.setName("Mary");
        hubert.setName("Mark");

        System.out.println(hubert.getName());  //hubert HAS been re-set so it will return "Mark"
        System.out.println(anne.printEverything());

    }
}
