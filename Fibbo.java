import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        if(n==0||n==1)
        {
            System.out.println(n);
            // return;
        }
        int count=2;
        while(count<n)
        {
            int c=a+b;
            a=b;
            b=c;
            count++;
        }
        System.out.println(b);
        sc.close();
    }
}
