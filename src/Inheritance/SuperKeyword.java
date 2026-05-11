package Inheritance;

class person{
    String name;

    person(String name){
        this.name=name;
    }
}

class employee extends person {
    employee(String name){
        super(name);
    }
}

public class SuperKeyword {

    public static void main(String []args){

        employee e1 = new employee("John");

    }
}
