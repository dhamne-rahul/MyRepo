package Basics;

import java.util.Scanner;

public class Sieve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int b=sc.nextInt();
        isPrime(n);
        sc.close();
    }

    private static void isPrime(int n) {
        boolean[] isprime=new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            if(isprime[i]==false){
                for(int j=i*i;j<=n;j+=i){
                    isprime[j]=true;
                }
            }

        }
        for(int i=2;i<=n;i++)
        {
            if(isprime[i]==false){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
