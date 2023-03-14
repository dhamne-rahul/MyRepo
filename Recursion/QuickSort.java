package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low,int high)
    {
        if(low>=high)
        {
            return; 
        }
        int st=low;
        int end=high;
        int mid=st+(end-st)/2;
        int pivot=arr[mid];
        while(arr[st]<pivot)
        {
            st++;
        }
        while(arr[end]>pivot)
        {
            end--;
        }
        int temp=arr[st];
        arr[st]=arr[end];
        arr[end]=temp;
        st++;
        end--;
        sort(arr, low, end);
        sort(arr, st, high);
    }
}
