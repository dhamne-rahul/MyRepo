package Math;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        // int n=12;
        // System.out.println(isPrime(n));
        int n=40;
        seive(n);
    }
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }


    public static void seive(int n)
    {
        boolean[] vis=new boolean[n+1];
        Arrays.fill(vis, false);

        for(int i=2;i<=n;i++)
        {
            if(vis[i]==false)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    vis[j]=true;
                }
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(vis[i]==false)
            {
                System.out.print(i+" ");
            }
        }

    }
}
