package Recursion.BackTracking;

import java.util.ArrayList;

public class PermutationArray {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        permute(0,new boolean[arr.length],arr,new ArrayList<Integer>());
    }
    public static void permute(int index,boolean[] vis,int[]arr,ArrayList<Integer>temp)
    {
        if(temp.size()==arr.length)
        {
            System.out.println(temp);
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(vis[i]!=true)
            {
                temp.add(arr[i]);
                vis[i]=true;
                permute(i+1, vis, arr, temp);
                temp.remove(temp.size()-1);
                vis[i]=false;
            }
            // permute(index+1, vis, arr, temp);
        }
    }
}
