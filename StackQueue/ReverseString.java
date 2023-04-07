package StackQueue;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        // String s="abcd";
        // String ans="";
        // // reverse(s,ans);
        // reverse(s,ans);
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=5;i++){
            st.add(i);
        }
        reversest(st);
        System.out.println(st);
        
    }

    private static void reversest(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int p=st.pop();
        reversest(st);
        st.add(p);
    }

    public static void reverse(String up,String p){
        if(up.length()==0){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        reverse(up.substring(1),ch+p);
        // p+=ch;
    }
    // private static String reverse(String s) {
    //     Stack<Character>st= new Stack<>();
    //     for(int i=0;i<s.length();i++){
    //         st.add(s.charAt(i));
    //     }
    //     String ans="";
    //     while(!st.isEmpty()){
    //         ans+=st.peek();
    //         st.pop();
    //     }
    //     return ans;
    // }
}
