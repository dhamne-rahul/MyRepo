package Recursion;
import java.util.*;
public class SubSequence {
    public static void main(String[] args) {
        
    }
    // public static void main(String[] args) {
    //     String s="abc";
    //     ArrayList<String>ans=new ArrayList<>();
    //     System.out.println("rahul");
    //     System.out.println(ans);
    //     subseq1("",s,ans);
    //     System.out.println(ans);
    //     ArrayList<String>ans=subseqret("", s);
    //     System.out.println(ans);
    //     int[] arr={1,2,3};
    //     List<List<Integer>>ans=subset(arr);
    //     for(List<Integer> i:ans)
    //     {
    //         for(Integer e:i)
    //         {
    //             System.out.print(e+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void subseq(String p,String up)
    // {
    //     if(up.isEmpty())
    //     {
    //         System.out.println(p);
    //         return;
    //     }
    //     char ch=up.charAt(0);
    //     subseq(p+ch, up.substring(1));
    //     subseq(p, up.substring(1));
    // }
    public static int subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            // System.out.println(p);
            return 1;
        }
        char ch=up.charAt(0);
        int a=subseq(p+ch, up.substring(1));
        int b=subseq(p, up.substring(1));
        return a+b;
    }
    public static List<List<Integer>>subset(int[]arr)
    {
        List<List<Integer>>outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer>temp=new ArrayList<>(outer.get(i));
                temp.add(num);
                outer.add(temp);

            }
        }
        return outer;

    }
    public static void subseq1(String p,String up,ArrayList<String>ans)
    {
        if(up.isEmpty())
        {
            ans.add(p);
            return;
        }
        char ch=up.charAt(0);
        subseq1(p+ch, up.substring(1),ans);
        subseq1(p, up.substring(1),ans);
    }
    public static ArrayList<String>subseqret(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseqret(p+ch, up.substring(1));
        ArrayList<String>right=subseqret(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
