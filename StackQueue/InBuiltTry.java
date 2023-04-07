package StackQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// import java.util.LinkedList;

import OOPS.ACCESS.A;

//Stack is LIFO data structure:the element enter in last are out first.
public class InBuiltTry {
    public static void main(String[] args) {
        // Stack<Integer>st=new Stack<>();
        // st.push(100);
        // st.push(200);
        // st.push(300);
        // st.push(400);
        // st.push(500);
        // st.pop();
        // System.out.println(st.toString());
        // System.out.println(st.search(200));

        Queue<Integer>q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        Deque<Integer>dq=new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.addFirst(50);
        dq.addLast(40);
        System.out.println(dq);

    }
}
