import java.io.*;

public class SimpleWriter {
    public static void main(String[] args){

        FileWriter fw;
        PrintWriter outputFile;

        {
            try {

                fw = new FileWriter("C:\\Users\\mnavarr3\\Downloads\\Names.txt", true);
                //also  fw = new FileWriter("Names.txt", true);  for non specific file location
                //append= true will simply add more text to the file
                //append= false will overwrite
                outputFile = new PrintWriter(fw);
                outputFile.println("Kamala");
                outputFile.println("Miles");
                outputFile.println("Nova");
                outputFile.close();

            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

}
