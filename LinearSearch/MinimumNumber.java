package LinearSearch;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=mini(arr);
        System.out.println(min);
    }
    private static int mini(int[] arr){
        int mini=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }
}
