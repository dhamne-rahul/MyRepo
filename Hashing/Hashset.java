package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20);
        set.add(30);
        set.add(50);
        // System.out.println(set);
        // System.out.println(set.contains(20));

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
