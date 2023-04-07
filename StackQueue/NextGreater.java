package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        int [] arr={6,8,0,1,3};
        int[] ans=solve(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] solve(int[] arr){
        int[] ans=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        ans[arr.length-1]=-1;
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            int curr=arr[i];
            while(!st.isEmpty() && arr[st.peek()]<curr){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=arr[st.peek()];
            }
            else{
                ans[i]=-1;
            }
            st.push(i);
        }
        return ans;
    }
}
