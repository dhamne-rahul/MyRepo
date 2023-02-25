package LinearSearch;
import java.util.Scanner;

public class LinearSerach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number to be search\n");
        int key=sc.nextInt();
        int location=lsearch(arr,key);
        System.out.println(key+" is found at :"+location);
    }
    private static int lsearch(int[]arr,int key){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
