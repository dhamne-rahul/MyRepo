package Recursion;

public class SearchInSorted {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,1,2,3};
        System.out.println(search(arr,2,0,arr.length-1));
    }
    public static int search(int[] arr,int target,int st,int en)
    {
        if(st>en)
        {
            return -1;
        }
        int mid=st+(en-st)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(arr[st]<=arr[mid])
        {
            if(target>=arr[st]&&target<=arr[mid])
            {
                return search(arr, target, st, mid-1);
            }
            else{
                return search(arr, target, mid+1, en);
            }
        }
        if(target>=arr[mid]&&target<=arr[en])
        {
            return search(arr, target, mid+1, en);
        }
        return search(arr, target, st, mid-1);
    }
}
