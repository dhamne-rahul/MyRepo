package Recursion;
import java.util.*;
public class NumberPad {
    public static void main(String[] args) {
        // pad("","12");
        List<String> ans=letterCombinations("7");
        System.out.println(ans);

    }
    public static void pad(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++)
        {
            char ch=(char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
            return new ArrayList<>();
        }
        List<String>ans=solve("",digits);
        return ans;
    }
    public static List<String> solve(String p,String up)
    {
        ArrayList<String>ans=new ArrayList<>();
        if(up.isEmpty())
        {
            ArrayList<String>temp=new ArrayList<>();
            temp.add(p);
            return temp;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-2)*3;i<(digit-1)*3;i++)
        {
            char ch=(char)('a'+i);
            ans.addAll(solve(p+ch,up.substring(1)));
        }
        return ans;
    }
}
