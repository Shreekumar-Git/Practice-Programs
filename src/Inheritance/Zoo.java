package Inheritance;

class Animals{
    String Name;
    int Age;

    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dogs extends Animals{
    String Breed;

    @Override
    void  makeSound(){
        System.out.println("Dog Barks");
    }

    void fetch(){
        System.out.println("dog is fetching");
    }
}

class cat extends Animals{
    String colour;

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }

    void climb(){
        System.out.println("cat is climbing");
    }
}
public class Zoo {
    public static void main(String []args){

        Dogs d1 = new Dogs();
        d1.Name = "coco";
        d1.Age = 2;
        d1.Breed= "GSD";
        d1.makeSound();
        d1.fetch();

        cat c1 = new cat();
        c1.Name = "alaisa";
        c1.Age=5;
        c1.colour= "ginger";
        c1.makeSound();
        c1.climb();

    }



}
