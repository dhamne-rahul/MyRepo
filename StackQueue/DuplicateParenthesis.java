package StackQueue;

import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
        System.out.println(solve("((a+b)+(c))"));//false;
        System.out.println(solve("((a+b))"));//true;
    }
    public static boolean solve(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i = 0;
        while(i<n)
        {
            if(s.charAt(i)==')'){
                int count=0;
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                st.pop();
                if(count<=0)
                {
                    return true;
                }
            } 
            else{
                st.push(s.charAt(i));
            }      
            i++;          
        }
        return false;
    }
}
