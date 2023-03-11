package Recursion;

import java.util.Scanner;
public class Fibbo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fibbo(n);
        System.out.println(ans);
    }
    public static int fibbo(int n)
    {
        if(n==0||n==1){
            return n;
        }
        return fibbo(n-2)+fibbo(n-1);
    }
}
