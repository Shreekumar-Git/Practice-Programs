package EncapsulationExmp;

public class EncapTest {

    private String name;
    private String idnum;
    private int age;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getIdNum(){
        return idnum;
    }

    public void setAge(int newAge){
        age= newAge;
    }

    public void setName(String newName){

        name = newName ;
    }

    public void setIdNum(String newId){

        idnum = newId;
    }
}
