package StackQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        // CustomStack st=new CustomStack();
        // st.push(10);
        // st.push(20);
        // st.push(30);
        // st.pop();
        // System.out.println(st.toString());
        // CustomQueue q=new CustomQueue();
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        // q.add(50);
        // q.display();
        // q.remove();
        // q.display();
        // System.out.println(q.front());
        // CLQueue cq=new CLQueue();
        // cq.insert(10);
        // cq.insert(20);
        // cq.insert(30);
        // cq.insert(40);
        // cq.insert(50);
        // cq.pop();
        // cq.display();
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        // st.pop();
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        // System.out.println(st.toString());
    }
}
