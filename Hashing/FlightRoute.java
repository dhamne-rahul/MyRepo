package Hashing;

import java.util.HashMap;

public class FlightRoute {
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("Chennai", "Bangluru");
        tickets.put("Mumbai", "Delhe");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhe", "Goa");
        String start=getStart(tickets);
        // System.out.print(start);
        while(tickets.containsKey(start)){
            System.out.print(start+" ->");
            start=tickets.get(start);
        }
        System.out.print(start);
    }
    public static String getStart(HashMap<String,String>hm){
        HashMap<String,String>revMap=new HashMap<>();
        for(String key:hm.keySet()){
            revMap.put(hm.get(key), key);
        }
        for(String key:hm.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}
