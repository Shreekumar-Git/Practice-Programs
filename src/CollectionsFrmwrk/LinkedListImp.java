package CollectionsFrmwrk;
import java.util.*;

public class LinkedListImp {


//LinkedList is a part of the Java Collections Framework and is present in the java.util package.
//It implements a doubly linked list where elements are stored as nodes containing data and references to the previous and next nodes, rather than in contiguous memory locations.

//The size of the LinkedList can grow or shrink dynamically at runtime.
//Maintains the order in which elements are inserted.
//Multiple duplicate elements can be stored.
//LinkedList is not thread-safe by default; it can be synchronized using Collections.synchronizedList().
//Provides better performance than ArrayList for insertion and deletion operations, especially at the beginning or middle.


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
