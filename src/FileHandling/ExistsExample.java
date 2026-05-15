package FileHandling;

import java.io.File;

public class ExistsExample {

    public static void main(String [] args){

        File obj = new File("myfile.txt");

        if(obj.exists()){
            System.out.println("The file exists");

        }
        else{
            System.out.println("the file does not exist");
        }

        System.out.println("The absolute path is: "+ obj.getAbsolutePath());   //Absolute path of the file or directory
    }
}
