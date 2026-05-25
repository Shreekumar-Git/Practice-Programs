package CollectionsFrmwrk;


import java.util.*;
public class TreeSetImp {
    // A TreeSet is a collection class that stores unique elements in a sorted order.
    // It is part of java.util package that implements the SortedSet interface, and internally uses a Red-Black tree to maintain sorting.
    //Does not allow null elements because it uses comparison for sorting, which causes NullPointerException.
    //Implements the NavigableSet interface and provides navigation methods like higher(), lower(), ceiling() and floor().
    //It is not synchronized. it must be synchronized using Collections.synchronizedSet()

    public static void main(String [] args){

        TreeSet<String> t = new TreeSet<>();

        t.add("a");
        t.add("b");
        t.add("c");
        t.add("d");
        t.add("e");
        // t.add(null);     null pointer exception

        System.out.println("Original tree set : " + t);

        t.remove("c");

        System.out.println("After removing element : " + t);

        t.pollFirst();

        System.out.println("After removing first element : " + t);

        t.pollLast();

        System.out.println("After removing last element : " +t);




        NavigableSet<String> set = new TreeSet<>();

        set.add("Geeks");
        set.add("For");
       // set.add("Geeks");    // no duplicates allowed
        set.add("Student");
        set.add("Temple");

        System.out.println("the tree set is : "+ set);

        String check = "Geeks";

        System.out.println("Contains " + check + " " + set.contains(check));

        System.out.println("First value : " + set.first());

        System.out.println("last value : " + set.last());

        String val = "Student";

        System.out.println("Higher : "+ set.higher(val));
        System.out.println("lower : " + set.lower(val));


        System.out.println();
        System.out.println("Iterated set");

        for(String ite : set){
            System.out.print(ite+ ",");
        }


    }
}
