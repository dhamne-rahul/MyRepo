package SlidingWindowandTwoPointer;

public class MaximunSubArraySumOfK {
    public static void main(String[] args) {
        int[] arr={2,5,1,8,2,9,1};
        int k=3;
        int ans=getAns(arr,k);
        System.out.println(ans);
    }
    public static int getAns(int[] arr,int k){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        int i;
        for(i=0;i<arr.length && i<k;i++){
            sum+=arr[i];
        }
        for(;i<arr.length;i++){
            ans=Math.max(ans, sum);
            sum-=arr[i-k];
            sum+=arr[i];
        }
        return ans;
    }
}
