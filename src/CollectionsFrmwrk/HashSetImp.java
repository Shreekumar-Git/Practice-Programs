package CollectionsFrmwrk;

import java.util.*;
public class HashSetImp {

    //HashSet in Java implements the Set interface of the Collections Framework.
    // It is used to store the unique elements, and it doesn't maintain any specific order of elements.
    //HashSet does not allow duplicate elements.
    //Uses HashMap internally which is an implementation of hash table data structure.
    //Also implements Serializable and Cloneable interfaces.
    //HashSet is not thread-safe. To make it thread-safe, synchronization is needed externally.
    //Does not support primitive types directly; requires wrapper classes (Integer, Character, etc.).


    public static void main(String [] args){

        HashSet<Integer> h = new HashSet<>();

        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        System.out.println("Hashset size : "+h.size());
        System.out.println("Hashset elements : "+ h);

        Iterator<Integer> iterator = h.iterator();

        System.out.print("Using Iterator method : ");

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ,");
        }

        System.out.println();

        System.out.print("Using Enhanced for loop : ");

        for(int hs : h){
            System.out.print(hs+" ,");
        }


    }


}
