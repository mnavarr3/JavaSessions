public class MethodsReturn {
    public static void main (String[] args){

        double d1 = 0.1;
        double myDouble = 0.01;

        double area = calculateAreaWithReturn(d1, myDouble);
        System.out.println("The Area is: " + area);



    }

    public static double calculateAreaWithReturn(double a, double b){

        double area = a*b;

        if (area > 0){
            return area;
        }

        return 0;
    }
}
