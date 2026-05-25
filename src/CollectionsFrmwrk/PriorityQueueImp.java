package CollectionsFrmwrk;


import java.util.*;
public class PriorityQueueImp {
    //A PriorityQueue in Java is a queue where elements are ordered based on their priority, rather than the order of insertion.
    // By default, it uses natural ordering (min-heap), but a custom comparator can be used to define different priorities.
    //Elements are processed based on priority rather than insertion order.
    //Supports standard queue operations like add(), poll(), and peek().
    //Automatically grows as elements are added and null insertion is not possible .
    //Uses a heap data structure internally to ensure efficient insertion and removal of the highest-priority element.

    public static void main(String [] args){

        PriorityQueue<Integer> p = new PriorityQueue<>();


        p.add(1);
        p.add(2);
        p.add(3);

        System.out.println(p);

        System.out.println("peek : " + p.peek());

        System.out.println("poll first : " + p.poll());


        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Banana");
        pq.add("orange");
        pq.add("pineapple");
        pq.add("apple");
        pq.add("mango");

        System.out.println("original priority queue : " + pq);

        System.out.println("Using Enhanced for loop : ");

        for(String value : pq){
            System.out.print(value+" ");
        }

        System.out.println();
        System.out.println("Using iterator");

        Iterator<String> iterator = pq.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }




}
