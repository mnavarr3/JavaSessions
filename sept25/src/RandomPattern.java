public class RandomPattern {
    public static void main (String[] args){

        for(int i=0; i<10; i++){
            System.out.println();
            for(int j=0; j<10; j++){
                if ((i%2 == 0 && j%2 ==0) || (i%2 > 0 && j%2 > 0)){
                    System.out.print( i +","+ j + " ");
                } else {
                    System.out.print(" ");
                }
            }
        }


    }

}
