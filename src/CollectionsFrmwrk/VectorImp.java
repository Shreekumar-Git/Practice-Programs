package CollectionsFrmwrk;

import java.util.*;
public class VectorImp {

//In Java, a Vector is a dynamic array that can grow or shrink in size as elements are added or removed.
// It is part of the java.util package and extends the AbstractList class.
//Maintains insertion order and allows duplicate and null values.
//Dynamically grows its size when capacity is exceeded.
//Implements List, RandomAccess, Cloneable, and Serializable interfaces.
//Vector is a Legacy class that was introduced in early versions of Java.
//Thread-safe: All methods are synchronized for safe multi-threaded access.
//ArrayList is preferred over vector in general when in-built thread synchronization is not required..

    public static void main(String [] args){

        Vector<String> v = new Vector<String>();

        v.add("BMW");
        v.add("Koenigsegg");
        v.add("Porsche");

        // same methods as linked list ( Add Remove Set Size etc)

        System.out.println(v);


        // vector capacity
        Vector<Integer> v1 = new Vector<Integer>(2);

        System.out.println("Initial capacity : "+ v1.capacity());

        v1.add(10);
        v1.add(20);
        System.out.println("Capacity after adding 2 elements : "+ v1.capacity());

        v1.add(30);
        System.out.println("Capacity after adding 3rd element : "+ v1.capacity());

        v1.add(40);
        System.out.println("Capacity after adding 4th element : "+ v1.capacity());

        v1.add(50);
        v1.add(60);
        System.out.println("Capacity after adding 6 elements : "+ v1.capacity());

        // the vector increases its size when we add more number of elements than its capacity
        // the formula is ( old capacity * 2 )
    }

}
