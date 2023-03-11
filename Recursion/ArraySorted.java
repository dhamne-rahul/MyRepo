package Recursion;

public class ArraySorted {
    public static void main(String[] args) {
        int[] arr={1,2,83,4,5};
        System.out.println(sorted(arr,0,arr.length-1));
    }
    public static boolean sorted(int[] arr,int i,int n)
    {
        if(i==n)
        {
            return true;
        }
        return arr[i]<arr[i+1]&&sorted(arr, i+1, n);
    }
}
