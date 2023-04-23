package Hashing;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums={3,2,3};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        Set<Integer>keys=map.keySet();
        for(Integer k:keys){
            if(map.get(k)>nums.length/3){
                System.out.println(k);
                return;
            }
        }
    }
}
