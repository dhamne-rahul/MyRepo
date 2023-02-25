package BinarySearch;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        boolean ans=binarySearch(arr,target);
        System.out.println(ans);
        sc.close();
    }
    public static boolean binarySearch(int[] arr,int target){
        int n=arr.length;
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(target<arr[mid]){
                //left
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}
