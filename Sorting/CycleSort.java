package Sorting;

import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        int n=arr.length;
        int i=0;
        while(i<n){
            int correct=arr[i]-1;
            if(correct<n-1&&arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
