package Math;

import java.util.Arrays;

public class SumTraingle {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        printSum(a);
    }
    public static void printSum(int[] arr)
    {
        if(arr.length==0)
        {
            return;
        }
        int[] temp=new int[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            temp[i-1]=arr[i-1]+arr[i];
        }
        printSum(temp);
        System.out.println(Arrays.toString(arr));
    }
}
