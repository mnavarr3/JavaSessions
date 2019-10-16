public class Arrays {

    public static void main(String[] args){
        int[] numbers;         //declare reference to array that will hold integers
        numbers = new int[6];     //created new array to hold 6 integers(set at zero for now), cannot change array size

        //numbers[0]= 0;
        //numbers[1]= 1;
        int i;
        for(i=0; i<6; i++) {
            numbers[i]=i;
        }

        System.out.println(numbers[5]);  //System.out.println(numbers); only prints address, so this addition of [5]
                                         //will include what is in position 5

        for(i=0; i<6; i++) {
            System.out.println(numbers[i]);
        }


        int [] daysWeKnow= {45,56,78};  //use curly brackets to insert integers (doesn't set any specific size)

        int size = numbers.length;

        numbers[4]=40;

        modify(numbers);          //call method and give it array address

        for (int j=0; j<size; j++){
            System.out.print(numbers[j]+", ");
        }
        System.out.println(" ");

        //re-assign
        numbers = new int[4];   //numbers become {0,0,0,0} and only 4 positions

        size = numbers.length;   //need to reassess for length else get errors
        for (int j=0; j<size; j++){
            System.out.print(numbers[j]+", ");
        }

        String[] myStrArray = new String[3];
        myStrArray[0]= new String("Hello");
        myStrArray[1]= new String("Hi");
        myStrArray[2]= "hj";

        System.out.println(myStrArray);
        print(myStrArray);                 //print using written function

        String[] my2ndStrArray= myStrArray;           //copying an array
        print(my2ndStrArray);

        for(int m=0; m< myStrArray.length; m++){
            my2ndStrArray[m] = myStrArray[m];
        }
        print(my2ndStrArray);
    }

    public static void modify(int[] a){             //method to set position 3 value to 55
        a[3]=55;
    }

    public static void print(String[] aStringArray){
        for(int i=0; i< aStringArray.length; i++){
            System.out.print(aStringArray);
        }
    }
}
