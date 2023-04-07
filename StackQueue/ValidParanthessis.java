package StackQueue;

import java.util.Stack;

public class ValidParanthessis {
    public static void main(String[] args) {
        String s="({}[)";
        if(isValid(s)){
            System.out.println("Valid Parenthessis");
        }
        else{
            System.out.println("Not Valid parenthesis");
        }
    }
    public static boolean isValid(String s){
        Stack<Character>st=new Stack<>();
        int n=s.length();
        int i=0;
        while(i<n){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==')' && st.peek()=='('){
                    st.pop();
                }
                else if(s.charAt(i)=='}' && st.peek()=='{'){
                    st.pop();
                }
                else if(s.charAt(i)==']' && st.peek()=='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            i++;
        }
        return st.isEmpty();
    } 
}
