package StackQueue;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] stocks={100,80,60,70,60,85,100};
        int[] span=new int[stocks.length];
        stockSpan(stocks,span);

        System.out.println(Arrays.toString(span));
    }

    private static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer>st=new Stack<>();
        st.push(0);
        span[0]=1;
        for(int i=1;i<stocks.length;i++){
            while(!st.isEmpty()&&stocks[st.peek()]<stocks[i]){
                st.pop();
            }
            span[i]=i-st.peek();
            st.push(i);   
        }
    }
}
