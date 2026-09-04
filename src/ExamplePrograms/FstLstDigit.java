package ExamplePrograms;

public class FstLstDigit {

    public static int firstDigit(int n) {
        while (n>=10){
            n/=10;
        }return n;
    }


    public static int lastDigit(int n){
        return(n%10);
    }

    public static void main() {

        int a = 123456;

        System.out.println("First digit :" + firstDigit(a)+"  " + "Last digit :" + lastDigit(a));
    }

}
