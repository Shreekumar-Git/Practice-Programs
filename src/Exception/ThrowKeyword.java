package Exception;


public class ThrowKeyword {
    static void CheckAge(int age){
        if (age<18){
            throw new IllegalArgumentException("Age must be 18 or above");
        }
    }

    public static void main(String []args){
        CheckAge(15);
    }
}
