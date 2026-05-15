package Exception;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {

    static void readfile(String filename) throws IOException{
        try(FileReader file = new FileReader(filename)){
            int data;
            while((data=file.read()) != -1){
                System.out.print((char)data);
            }
        }

    }

    public static void main(String [] args){
        try{
            readfile("test.txt");

        }
        catch(IOException e){
            System.out.println("Error reading file or file not found"+ e.getMessage());
        }

        System.out.println("\n the program continues after file operation");
    }
}
