public class Palindrome {
    public static void main (String[] args){

        String word = "APPA";
        String RevWord = "";
        for(int i = word.length()-1; i>=0;i--){
            RevWord= RevWord + word.charAt(i);
        }

        System.out.println(RevWord);

        if (word.equals(RevWord))
            System.out.println("IT IS A PALINDROME");
        else System.out.println("IT IS NOT A PALINDROME");
    }
}

