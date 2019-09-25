import java.io.File;
import java.util.Scanner;


public class SimpleFileReader {
    public static void main (String[] args) throws Exception {
        File file = new File("friends.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
