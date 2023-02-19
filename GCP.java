package Basics;

import java.util.Scanner;

public class GCP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans=gcp(n1,n2);
        System.out.println(ans);
        System.out.println(lcm(ans, n1, n2));
        sc.close();
    }
    public static int gcp(int a,int b){
        while(b!=0){
            int mod=a%b;
            a=b;
            b=mod;
        }
        return a;
    }
    public static int lcm(int gcd,int a,int b){
        return (a*b)/gcd;
    }
}
