package LinearSearch;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean ans=search(str,'d');
        System.out.println(ans);
        sc.close();
    }
    private static boolean search(String s,char c){
        if(s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
}
