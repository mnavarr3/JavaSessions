import java.util.Scanner;

public class balance {
    public static void main (String[] args) {
        int balance = 100;
        String text = "";
        while (balance > 0) {
            text = "Your balance: \u0024" + balance + ".";
            text += "\nAmount to withdraw:";

            System.out.println(text);

            Scanner input = new Scanner(System.in);
            int amount = input.nextInt();

            balance = balance - amount;
        }
        System.out.println("Balance is " + balance + ". Nothing left.");
        text += "\nIt is now " + balance + " \u0024" + " ";
    }
}
