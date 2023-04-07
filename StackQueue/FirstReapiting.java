package StackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FirstReapiting {
    public static void main(String[] args) {
        // String s="aabccxc";
        getAns("aabccxb");
    }
    public static void getAns(String s){
        int n=s.length();
        Queue<Character>q=new LinkedList<>();
        int[] freq=new int[26];
        Arrays.fill(freq, 0);
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1 && freq[q.peek()-'a']!=0){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
    }
}
