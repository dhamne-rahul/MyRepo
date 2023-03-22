package Recursion.Problem;

import java.util.ArrayList;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr={5,2,1};
        // ArrayList<Integer>temp=new ArrayList<>();
        ArrayList<Integer>ans=solve(0,arr,0);
        System.out.println(ans);
    }

    private static ArrayList<Integer> solve(int index, int[] arr,int sum ) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(index==arr.length)
        {
            ans.add(sum);
            return ans;
        }
        // take::
        ArrayList<Integer>t1=solve(index+1,arr,sum+arr[index]);
        ArrayList<Integer>t2=solve(index+1,arr,sum);
        t1.addAll(t2);
        return t1;

    }
    
}
