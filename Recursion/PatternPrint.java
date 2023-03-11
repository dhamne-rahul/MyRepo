package Recursion;

public class PatternPrint {
    public static void main(String[] args) {
        print2(4,0);
    }
    public static void print1(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            System.out.print("* ");
            print1(r, c+1);
        }
        else{
            System.out.println();
            print1(r-1, 0);
        }
    }
    public static void print2(int r,int c)
    {
        if(r==0)
        {
            return;
        }
        if(c<r)
        {
            print2(r, c+1);
            System.out.print("* ");
        }
        else{
            print2(r-1, 0);
            System.out.println();
        }
    }
}
