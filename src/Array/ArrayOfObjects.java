package Array;

class student{

    public int roll_no;
    public String name;

    student(int roll_no, String name){
        this.roll_no=roll_no;
        this.name=name;
    }

}

public class ArrayOfObjects {

    public static void main(String []args){
        student [] arr;

        arr = new student[6];

        arr[0] = new student(1,"Shree");
        arr[1] = new student(2,"Anu");
        arr[2] = new student(3,"Leo");
        arr[3] = new student(4,"Baby Kannan");
        arr[4] = new student(5,"karuppu");
        arr[5] = new student(6,"Durai singam");

        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println("Element at "+ i +": { "+ arr[i].roll_no+ " , " + arr[i].name + " }");
        }
    }
}
