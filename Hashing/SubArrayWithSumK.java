package Hashing;

import java.util.HashMap;

public class SubArrayWithSumK {
    public static void main(String[] args) {
        int[] arr={10,2,-2,-20,10};
        int k=-10;
        int ans=getAns(arr,k);
        System.out.println(ans);
    }
    public static int getAns(int[] arr,int k){
        // sum:freq hashmap.
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        int ans=0;
        hm.put(0, 1);
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k);
            }
            if(hm.containsKey(sum)){
                hm.put(sum, hm.get(sum)+1);
            }
            else
                hm.put(sum, 1);
        }
        return ans;
    }
}
