package Math;

public class IthBit {
    public static void main(String[] args) {
        int n=10;
        int i=4;
        int ans=getbit(n,i);
        System.out.println(ans);
    }
    public static int getbit(int n,int i)
    {
        int mask=1<<i-1;
        return ((n&mask)!=0)?1:0;
    } 
}
