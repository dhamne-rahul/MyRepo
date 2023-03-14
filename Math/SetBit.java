package Math;

public class SetBit {
    public static void main(String[] args) {
        int n=10;
        int i=3;
        // System.out.println(reset(n,i));
        // System.out.println(setbit(n,i));
    }
    public static int setbit(int n,int i)
    {
        int mask=1<<i-1;
        return n|mask;
    }
    // public static int reset(int n,int i)
    // {
        // return (~(1<<n-1)&n);
    // }
}
