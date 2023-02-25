package BinarySearch;
import java.util.Scanner;
public class Floor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=floor(arr,target);
        System.out.println(ans);
        sc.close();
    }
    public static int floor(int[] arr,int target){
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
                ans=arr[mid];
            }
            else{
                en=mid-1;
            }
        }
        return ans;
    }
}
