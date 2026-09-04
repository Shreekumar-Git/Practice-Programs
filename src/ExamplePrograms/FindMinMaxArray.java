package ExamplePrograms;
import java.util.*;

public class FindMinMaxArray {
    public static void getMinMax(ArrayList<Integer> arr , ArrayList<Integer> result){

        int mini, maxi, i;
        int n = arr.size();

        if(n%2==1){
            mini = maxi = arr.get(0);          //   optimal approach   O(1) Time and O(n) Space complexity.
            i = 1;
        }else{
            if(arr.get(0)<arr.get(1)){
                mini=arr.get(0);
                maxi=arr.get(1);
            }else{
                mini=arr.get(1);
                maxi=arr.get(0);
            }
            i=2;
        }

        while(i< n-1){
            if(arr.get(i)<arr.get(i+1)){
                mini=Math.min(mini,arr.get(i));
                maxi=Math.max(maxi,arr.get(i+1));
            }else{
                mini=Math.min(mini,arr.get(i+1));
                maxi=Math.max(maxi,arr.get(i));
            }
            i+=2;
        }

        result.add(mini);
        result.add(maxi);
    }

    public static void main(String[]args){

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12,32,14,56,2,11,5));

        ArrayList<Integer> result = new ArrayList<>();

        getMinMax(arr , result);
        System.out.print(result.get(0)+" "+result.get(1));
    }
}


