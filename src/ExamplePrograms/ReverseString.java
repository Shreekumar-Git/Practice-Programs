package ExamplePrograms;

public class ReverseString {

    public static void main (String[] args){

        String word = "ABCD";
        String RevWord = "";
        for(int i = word.length()-1; i>=0;i--){
            RevWord= RevWord + word.charAt(i);
        }

        System.out.println(RevWord);
    }
}
