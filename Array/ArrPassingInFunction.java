package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrPassingInFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void change(int[] arr) {
        arr[0]=99;
    }
}
