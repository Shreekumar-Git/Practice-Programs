package ExamplePrograms;

public class OddOrEven {

    public static boolean isEven(int a) {
        boolean result;
        if (a % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;

    }

    public static void main() {

        int a = 15;
        int b = 15;

        if(isEven(a)==true){
            System.out.println("the number is a even number");
        }else{
            System.out.println("it is an odd number");
        }


    }
}
