package Inheritance;
// Single inheritance
class Dad{
    int money = 2000;
}

class Son extends Dad{
}

// multi level inheritance

class Animal{
    void eat(){
        System.out.println("Animal can eat");
    }
}

class Dog extends Animal{
    void Barks(){
        System.out.println("Dog can bark");
    }
}

class Puppy extends Dog{
    void weeps(){
        System.out.println("Puppy weeps");
    }
}

public class Mainclass {

    public static void main (String [] args){
        Son s1= new Son();
        System.out.println(s1.money);

        Puppy p1 = new Puppy();
        p1.eat();
    }
}
