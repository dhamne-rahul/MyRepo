package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        swap(arr,2,3);
        System.out.println(Arrays.toString(arr));

    }
    private static void swap(int[] arr,int i,int j){
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}
