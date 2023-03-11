package Recursion;

public class Sum1ToN {
    public static void main(String[] args) {
        System.out.println(sum(10000));
    }
    public static int sum(int n){
        if(n==0||n==1)
        {
            return 0;
        }
        return n+sum(n-1);
    }
}
