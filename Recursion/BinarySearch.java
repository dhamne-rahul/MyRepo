package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(search(arr,3,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int st,int en)
    {
        if(st>en){
            return -1;
        }
        int mid=st+(en-st)/2;
        if(arr[mid]==target)
        {
            return mid+1;
        }
        else if(arr[mid]<target)
        {
            return search(arr, target, mid+1, en);
        }
        else
            return search(arr, target, st, mid-1);
    }
}
