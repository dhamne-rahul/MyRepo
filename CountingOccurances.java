package Basics;

import java.util.Scanner;

public class CountingOccurances {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0)
        {
            if(n%10==5){
                count++;
            }
            n/=10;
        }
        System.out.println(count);
        sc.close();
    }
}
