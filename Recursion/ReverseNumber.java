package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        // reverse1(017);
        // System.out.println(ans);
    }
    public static int reverse(int n,int ans)
    {
        if(n<10)
        {
            ans=ans*10+n;
            return ans;
        }
        return reverse(n/10, ans*10+(n%10));
    }
    static int ans=0;
    public static void reverse1(int n){
        if(n==0)
        {
            return;
        }
        ans=ans*10+(n%10);
        reverse1(n/10);
    }
}
