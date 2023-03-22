package Recursion;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String s="abc";
        // ArrayList<String>ans=permutation1("",s);
        permutation("", s);
    }
    public static void permutation(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i, p.length());
            permutation(f+ch+l, up.substring(1));
        }
    }
    public static ArrayList<String> permutation1(String p,String up)
    {
        ArrayList<String>ans=new ArrayList<>();
        if(up.isEmpty())
        {
            ArrayList<String>temp=new ArrayList<>();
            // System.out.println(p);
            temp.add(p);
            return temp;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i, p.length());
            ans.addAll(permutation1(f+ch+l, up.substring(1)));
        }
        return ans;
    }
    public static int permutationCount(String p,String up)
    {
        if(up.isEmpty())
        {
            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i, p.length());
            count=count+permutationCount(f+ch+l, up.substring(1));
        }
        return count;
    }
}
