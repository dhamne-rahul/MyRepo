package Recursion.Problem;

public class LengthOfString {
    public static void main(String[] args) {
        String s="rahul";
        System.out.println(len(s));
    }
    public static int len(String s)
    {
        if(s.isEmpty())
        {
            return 0;
        }
        return 1+len(s.substring(1));
    }
}
