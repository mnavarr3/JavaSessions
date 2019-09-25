import java.util.Random;


public class RandomNumbers {
    public static void main (String[] args){

        for(int i=0; i<10; i++) {  //outer loop, manages rows
            System.out.println();


            for (int j = 0; j < 10; j++) {  //inner loop, manages columns


                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 > 0 && j % 2 > 0)) {
                    Random randomNumbers = new Random();
                    System.out.print(randomNumbers.nextInt(10));
                } else {
                    System.out.print("   ");
                }


            }
        }


    }
}

