package BinarySearch;
import java.util.*;
public class Ceiling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=ceiling(arr,target);
        System.out.println(ans);
        sc.close();
    }
    public static int ceiling(int[] arr,int target){
        int ans=-1;
        int st=0;
        int en=arr.length-1;
        while(st<=en){
            int mid=st+(en-st)/2;
            if(arr[mid]==target){
                return arr[mid];
            }
            if(arr[mid]<target){
                st=mid+1;
            }
            else{
                en=mid-1;
                ans=arr[mid];
            }
        }
        return ans;
    }
}
