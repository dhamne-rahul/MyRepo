package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i]);
        // }
        // for(int i:arr)
        // {
        //     System.out.println(i);
        // }
        System.out.println(Arrays.toString(arr));
    }
}
