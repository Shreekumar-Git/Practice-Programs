package CollectionsFrmwrk;

import java.util.*;
public class ArrayListImp {

//ArrayList in Java is a resizable array provided in the java.util package.
// Unlike normal arrays, its size can grow or shrink dynamically as elements are added or removed.
//Elements can be accessed using their indices, similar to arrays.
//Duplicates are allowed.
//Elements are stored in the order they are inserted.
//ArrayList is not thread-safe. To make it thread-safe, we must wrap it manually using Collections.synchronizedList().

    public static void main(String [] args){


        List <String> list = new ArrayList<>();

        list.add("Java");
        list.add("python");
        list.add("c++");

        System.out.println("Programming languages");

        for(String lang :list){
            System.out.println(lang);
        }

        System.out.println("\n \n");

        // Array list

        ArrayList<String> al = new ArrayList<>();

        al.add("Geeks");
        al.add("Geeks");

        System.out.println("Original list : "+ al);

        al.add(1,"For");

        System.out.println("list after adding element at index 1 : "+ al);

        al.remove(0);

        System.out.println("list after removing element at index 0 : "+al);

        al.remove("Geeks");

        System.out.println("Element Geeks removed : "+ al);

        al.set(0,"GFG");
        System.out.println("List after updation : "+ al);


    }

}
