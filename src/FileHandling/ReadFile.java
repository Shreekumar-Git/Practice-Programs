package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {

    public static void main (String[] args){

        try {
            FileReader obj = new FileReader("myfile.txt");
            Scanner Reader = new Scanner(obj);

            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException  e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}

