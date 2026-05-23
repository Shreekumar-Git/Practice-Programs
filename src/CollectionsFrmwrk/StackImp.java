package CollectionsFrmwrk;

import java.util.Stack;

public class StackImp {

//In Java, a Stack is a linear data structure that follows the Last In First Out (LIFO) principle and is defined in the java.util package.
// Internally, it extends the Vector class.
//Stack class maintains insertion order and allows duplicates and null values.
//Grows dynamically when its capacity is exceeded.
//Stack methods are synchronized.
//Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.

    public static void main(String []args){

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println( s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

        System.out.print("\n"+s);

        Stack<Integer> s2 = new Stack<>();

        s2.push(1);
        s2.push(2);
        s2.push(3);
        s2.push(4);
        s2.push(5);
        s2.push(6);

        System.out.println("the original stack is :" + s2);

        System.out.println("Element at the top of the stack is : "+ s2.peek());

        System.out.println("Final Stack : "+ s2);

        System.out.println("Popped element  :" + s2.pop());

        System.out.println("Popped element  : " + s2.pop() );

        System.out.println(" Is Stack empty : "+ s2.empty());

        System.out.println("Popped element : " + s2.pop());

        System.out.println("Is Stack empty  : " + s2.isEmpty());


        System.out.println(""+ s2.capacity());
    }


}
