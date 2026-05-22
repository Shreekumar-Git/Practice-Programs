package CollectionsFrmwrk;
import java.util.*;

public class LinkedListImp {

    public static void main(String []args){

        LinkedList<String> l1 = new LinkedList<String>();

        l1.add("one");
        l1.add("two");
        l1.add("three");
        l1.add("four");
        l1.add("five");

        System.out.println(l1);

    //  variable type = linked list  object type = linked list      cannot use methods of list and use linked list methods only.
        LinkedList<String> l2 = new LinkedList<String>();


        // variable type = list   object type = linked list     can use only list methods and not linked list methods
        //  List<String> l2 = new LinkedList<String>();

        // both are related but not the same

        l2.add("Geeks");
        l2.add("Geeks");
        l2.add(1,"For");

        System.out.println("Standard for loop :");
        for( int i = 0 ; i < l2.size() ; i++){
            System.out.print(l2.get(i) + " ");
        }

        System.out.println("\nEnhanced for loop :");
        for(String str : l2){
            System.out.print(str + " ");
        }
    }
}
