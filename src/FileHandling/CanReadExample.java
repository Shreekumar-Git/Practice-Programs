package FileHandling;

import java.io.File;
import java.io.IOException;

public class CanReadExample {
    public static void main (String [] args){

        try{
            File obj = new File("newfile.txt");

            if(obj.createNewFile()){
                System.out.println("File is created successfully");

            }
            else {
                System.out.println("File already exists");
            }

            if(obj.canRead()){                              // obj.canWrite()  to check if a file can be written to by the program
                System.out.println("File can be read");
            }
            else{
                System.out.println("File cannot be read");
            }

        }catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();

        }

    }
}
