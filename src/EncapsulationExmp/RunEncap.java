package EncapsulationExmp;

public class RunEncap {

    public static void main(String [] args){
        EncapTest encap = new EncapTest();

        encap.setName("Shivu");
        encap.setAge(28);
        encap.setIdNum("1256ms");

        System.out.println("Name "+ encap.getName()+ "  Age "+encap.getAge()+ "  ID " + encap.getIdNum());
    }
}
