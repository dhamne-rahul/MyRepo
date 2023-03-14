package Recursion;
import java.util.Arrays;
public class MergeSort
{
    public static void main(String[] args) { 
        int[] arr={3,4,6,2,3,5,-7,3,6,4};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
        
    }
    public static int[] mergersort(int[] arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergersort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergersort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] ans=new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                ans[k]=left[i];
                k++;
                i++;
            }
            else{
                ans[k]=right[j];
                k++;
                j++;
            }
        }
        while(i<left.length)
        {
            ans[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length)
        {
            ans[k]=right[j];
            k++;
            j++;
        }
        return ans;
    }
    public static void mergeSortInPlace(int[] arr,int st,int en)
    {
        if(en-st==1)
        {
            return; 
        }
        int mid=(st+en)/2;
        mergeSortInPlace(arr, st, mid);
        mergeSortInPlace(arr, mid, en);

        mergeInPlace(arr,st,mid,en);
    }
    public static void mergeInPlace(int[] arr,int st,int mid,int en)
    {
        int[]ans=new int[en-st];
        int i=st;
        int j=mid;
        int k=0;
        while(i<mid&&j<en)
        {
            if(arr[i]<arr[j])
            {
                ans[k]=arr[i];
                i++;
            }
            else{
                ans[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid)
        {
            ans[k]=arr[i];
            k++;
            i++;
        }
        while(j<en){
            ans[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<ans.length;l++)
        {
            arr[st+l]=ans[l];
        }
    }
}
// public static void mergeSortInPlace(int[] arr,int st,int en)
//     {
//         if(en-st==1)
//         {
//             return;
//         }
//         int mid=(st+en)/2;
//         mergeSortInPlace(arr,st,mid);
//         mergeSortInPlace(arr, mid, en);

//         mergeInPlace(arr,st,mid,en);
//     }
//     private static void mergeInPlace(int[] arr, int st, int mid, int en) {
//         int[] ans=new int[en-st];

//         int i=st;
//         int j=mid;
//         int k=0;

//         while(i<mid && j<en)
//         {
//             if(arr[i]<arr[j])
//             {
//                 ans[k]=arr[i];
//                 k++;
//                 i++;
//             }
//             else{
//                 ans[k]=arr[j];
//                 k++;
//                 j++;
//             }
//         }
//         while(i<mid)
//         {
//             ans[k]=arr[i];
//             k++;
//             i++;
//         }
//         while(j<en)
//         {
//             ans[k]=arr[j];
//             k++;
//             j++;
//         }

//         for (int l=0;l<ans.length;l++) {
//             arr[st+l]=ans[l];
//         }
//     }