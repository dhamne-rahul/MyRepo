package Recursion;

public class RemoveAs {
    public static void main(String[] args) {
        String str="baccad";
        // StringBuilder ans=remove(str,new StringBuilder(),0);
        // System.out.println(ans.toString());
        // skip("", str);
        System.out.println(skipApple("absappleadc"));
    }
    public static StringBuilder remove(String s,StringBuilder ans,int i)
    {
        if(i==s.length())
        {
            return ans;
        }
        if(s.charAt(i)!='a')
        {
            return remove(s, ans.append(s.charAt(i)), i+1);
        }
        return remove(s, ans, i+1);
    }
    public static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch!='a'){
            skip(p+ch, up.substring(1));
        }
        else
            skip(p, up.substring(1));
    }
    public static String skipApple(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        if(up.startsWith("apple"))
        {
            return skipApple(up.substring(5));
        }
        return up.charAt(0)+skipApple(up.substring(1));
    }
    
}
