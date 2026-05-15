package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String []args){

        try {
            FileWriter Writer = new FileWriter("myfile.txt");

            Writer.write("I want to go on a bike ride soon. I like to ride my bike in the mountains");
            Writer.close();

            System.out.println("File has been written successfully");
        }

        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
