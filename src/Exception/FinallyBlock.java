package Exception;

public class FinallyBlock {

    public static void main(String [] args){

        int [] numbers = {1,2,3,4};

        try {
            // this will give array Index out of bound error
            System.out.println(numbers[5]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The given index is not present in the Array");
        }

        finally{
            System.out.println("This block will be executed most of the time except " +
                    "(jvm crash, system.exit(), infinite loop before this block");
        }
        System.out.println("The program continues");
        }
}

