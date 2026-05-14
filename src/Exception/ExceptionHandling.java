package Exception;

public class ExceptionHandling {

    public static void main(String [] args){

        int a = 10;
        int b = 0;

    //    int ans = a/b;
    //    System.out.println(ans);      will get error in the program (Arithmetic exception)

    // Exception Handling
        try{
            int ans = a/b ;
            System.out.println(ans);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero : Arithmetic exception");
        }
    }
}
