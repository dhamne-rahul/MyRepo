package Hashing;
import java.util.HashMap;
import java.util.Set;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("US", 50);
        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("Pakistan"));
        // System.out.println(hm.remove("china"));
        System.out.println(hm);
        System.out.println(hm.size());

        // Iterator on hashmap.
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        System.out.println();
        for (String k : keys) {
            System.out.println(k+": "+hm.get(k));
        }
        
    }
}
