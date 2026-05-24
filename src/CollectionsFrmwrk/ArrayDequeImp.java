package CollectionsFrmwrk;

import java.util.*;

public class ArrayDequeImp {

    //The Stack class in Java inherits from Vector in Java. It is a thread-safe class.
    // It is recommended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded environment.

    public static void main(String []args){

        //Stack implementation

        Stack<Integer> s = new Stack<>();
        System.out.println(" using Stack (LIFO)");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack  :" + s);

        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }

        //Deque implementation

        Deque<Integer> d = new ArrayDeque<>();

        System.out.println(" \n using ArrayDeque (LIFO)");
        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        System.out.println("original deque :" +d);
        while(!d.isEmpty()){
            System.out.print(d.pop()+ " ");
        }




    }

}
