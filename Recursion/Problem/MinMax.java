package Recursion.Problem;

public class MinMax {
    public static void main(String[] args) {
        int[] arr={1, 4, 45, 6, -50, 10, 2};
        int[] ans=get(arr,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.println(ans[0]+"   "+ans[1]);
    }
    public static int[] get(int[] arr,int i,int min,int max)
    {
        if(i==arr.length-1)
        {
            return new int[] {min,max};
        }
        return get(arr, i+1, Math.min(min, arr[i]), Math.max(max, arr[i]));
    }
}
