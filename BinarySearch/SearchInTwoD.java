package BinarySearch;
import java.util.Scanner;
public class SearchInTwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        boolean ans=search(matrix,target);
        System.out.println(ans);
        sc.close();
    }
    public static boolean search(int[][] arr,int target){
        int n=arr.length;
        int r=0,c=arr[0].length-1;
        while(r<n && c>=0){
            if(arr[r][c]==target){
                return true;
            }
            if(target<arr[r][c]){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
