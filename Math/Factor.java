package Math;

public class Factor {
    
    public static void main(String[] args) {
        int n=20;
        factor(n);
    }
    public static void factor(int n)
    {
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println(n);
    }
}
