package Array;
import java.util.Arrays;
import java.util.Scanner;
public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<arr[0].length;j++)
        //     {
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int[] i:arr)
        {
            System.out.println(Arrays.toString(i));
        }
        sc.close();
    }
}
