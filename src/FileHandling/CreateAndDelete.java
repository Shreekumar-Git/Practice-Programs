package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAndDelete {

    public static void main(String [] args) {
        try {
            File obj = new File("new.txt");

            if (obj.createNewFile()){
                System.out.println("File created "+obj.getName());
            }
            else {
                System.out.println("File already exists");
            }

            if(obj.delete()){
                System.out.println("The deleted file is: "+obj.getName());
            }
            else{
                System.out.println("Failed in deleting the file");
            }
        }

        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();

        }
    }
}
