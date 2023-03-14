package Math;

public class LCM {
    public static void main(String[] args) {
        int a=20,b=25;
        // int hc=hcm(a, b);
        // System.out.println(hc);
        // int lcm=(a*b)/hc;
        // System.out.println(lcm);
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
    public static int hcm(int a,int b)
    {
        while(b!=0)
        {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}
