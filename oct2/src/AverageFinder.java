public class AverageFinder {
    public static void main(String[] args){
        double avg = findAverage(args);
        System.out.println("The average is "+ avg);
    }
    private static double findAverage(String[] input){
        double result = 0;
        for(String s : input){
            result+=Integer.parseInt(s);
        }
        return result;    //should be result/input.length;
    }
}
