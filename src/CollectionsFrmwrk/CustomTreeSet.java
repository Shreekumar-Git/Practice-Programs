package CollectionsFrmwrk;

import java.util.*;
public class CustomTreeSet {

    public static void main(String []args){

    Set<StringBuffer> set = new TreeSet<>(new Comparator<StringBuffer>() {
        @Override
        public int compare(StringBuffer sb1, StringBuffer sb2) {
            return sb1.toString().compareTo(sb2.toString());
        }
    });
    set.add(new StringBuffer("a"));
    set.add(new StringBuffer("z"));
    set.add(new StringBuffer("l"));
    set.add(new StringBuffer("b"));
    set.add(new StringBuffer("o"));
    set.add(new StringBuffer("1"));

    System.out.println(set);
    }
}
