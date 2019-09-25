import java.util.Scanner;

public class AreasReturn {
    public static void main (String[] args){
        System.out.println("Please enter your choice for calculation: 1 (Circle), 2 (rectangle), 3(square).");

        int selection;
        Scanner keyboard = new Scanner(System.in);

        selection = keyboard.nextInt();
        double area;


        if(selection == 1){
            System.out.println("Please enter the circle's radius: ");
            double radius = keyboard.nextInt();

            area = calculateAreaForCircle(radius);
        }
        if(selection == 2){
            System.out.println("Please enter the rectangle width: ");
            double w = keyboard.nextInt();
            System.out.println("Please enter the rectangle length: ");
            double l = keyboard.nextInt();
            area = calculateAreaForRectangle(w, l);
        }
        else{
            System.out.println("Please enter the square dimensions: ");
            double a = keyboard.nextInt();
            area = calculateAreaForSquare(a);
        }

        System.out.println("The area is: " + area);
    }

    public static double calculateAreaForCircle(double radius){
        return Math.PI * radius * radius;
    }
    public static double calculateAreaForRectangle(double w, double l){
        return w*l;
    }
    public static double calculateAreaForSquare(double a){
        return a*a;
    }
}
