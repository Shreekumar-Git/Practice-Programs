package CollectionsFrmwrk;

import java.util.*;

public class ArrayDequeImp {

    //The Stack class in Java inherits from Vector in Java. It is a thread-safe class.
    // It is recommended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded environment.
    //The Deque interface is part of the java.util package and extends the Queue interface.
    // It stands for Double-Ended Queue and represents a linear collection that allows insertion, removal, and retrieval of elements from both ends.
    //Allows insertion and deletion from both front and rear
    //Can be used as both stack (LIFO) and queue (FIFO)
    //Common implementations are ArrayDeque and LinkedList

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
