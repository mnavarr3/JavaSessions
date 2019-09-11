public class Loops {
    public static void main(String[] args){

        //simple for loop
        int i =0, runs=0;
        for(i = 10; i <23; i=i+3){
            if(i%2 ==0){
                System.out.println("Hey");
            }
            runs++;
        }
        System.out.println("i: " + i + " runs: " + runs);


//another comment


        // while loop

        boolean expression = true;
        int counter = 0;
        while (expression){
            int integerInsideWhile = 10;
            counter++;

            if(counter == 5){                 //this is the exit strategy
                break;
            }
        }
        System.out.println("We are done with the loop and the counter is: " + counter);
    }
}
