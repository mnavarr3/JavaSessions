import java.io.*;
import java.util.Scanner;

public class FileWriteExample {

    public static void main(String[] args) throws IOException
    {
        String filename;
        String friendName;
        int numFriends;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many friends do you have? ");
        numFriends = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("Enter the filename: ");
        filename = keyboard.nextLine();

        FileWriter fwriter = new FileWriter(filename);
        PrintWriter outputFile = new PrintWriter(fwriter);

        for (int i=1; i<=numFriends; i++){
            System.out.print("Enter the name of a friend " + "number" + i + ": ");
            friendName = keyboard.nextLine();

            outputFile.println(friendName);
        }

        outputFile.close();


    }

}
