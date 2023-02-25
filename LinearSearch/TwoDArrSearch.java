package LinearSearch;
import java.util.Scanner;
public class TwoDArrSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the number to be search\n");
        int k=sc.nextInt();
        boolean ans=search(arr,k);
        System.out.println(ans);
    }
    public static boolean search(int[][] arr,int k){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}
