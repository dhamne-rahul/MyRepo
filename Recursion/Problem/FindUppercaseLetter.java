package Recursion.Problem;

public class FindUppercaseLetter {
    public static void main(String[] args) {
        String s="raPhuZsdf";
        System.out.println(find(s,0));
    }
    public static char find(String s,int i)
    {
        if(i==s.length())
        {
            return ' ';
        }
        if(s.charAt(i)-'A'<26)
        {
            return s.charAt(i);
        }
        return find(s, i+1);
    }
}
