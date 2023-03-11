package Recursion;

import java.util.Arrays;

public class SelectioSort {
    public static void main(String[] args) {
        int[] arr={50,-5,4,3,2,1};
        sort(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int r,int c)
    {
        if(r==arr.length-1)
        {
            return;
        }
        if(c<arr.length)
        {
            if(arr[r]>arr[c])
            {
                int temp=arr[r];
                arr[r]=arr[c];
                arr[c]=temp;
            }
            sort(arr, r, c+1);
        }
        sort(arr, r+1, r+1);
    }
}
