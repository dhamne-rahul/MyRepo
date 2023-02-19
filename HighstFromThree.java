package Basics;

import java.util.Scanner;

public class HighstFromThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int max=n1;
        if(n2>max){
            max=n2;
        }
        if(n3>max){
            max=n3;
        }
    System.out.println(max);
    sc.close();
}
}

