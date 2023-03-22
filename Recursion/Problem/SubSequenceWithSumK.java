package Recursion.Problem;

public class SubSequenceWithSumK {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,-1};
        int ans=solve(0,arr,3);
        System.out.println(ans);
    }
    public static int solve(int index,int[]arr,int sum)
    {
        if(index==arr.length)
        {
            if(sum==0)
            {
                return 1;
            }        
            else{
                return 0;
            }
        }
        //take::
        sum-=arr[index];
        int f=solve(index+1,arr,sum);
        sum+=arr[index];
        int s=solve(index+1, arr, sum);
        return f+s;
    }
}
