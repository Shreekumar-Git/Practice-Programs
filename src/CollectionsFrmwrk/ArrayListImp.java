package CollectionsFrmwrk;

import java.util.*;
public class ArrayListImp {

    public static void main(String [] args){


        List <String> list = new ArrayList<>();

        list.add("Java");
        list.add("python");
        list.add("c++");

        System.out.println("Programming languages");

        for(String lang :list){
            System.out.println(lang);
        }


    }

}
