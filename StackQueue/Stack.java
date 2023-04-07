package StackQueue;

public class Stack {
    public int[] arr;
    static final int DEFALULT_SIZE=5;
    public int top;

    Stack(){
        this(DEFALULT_SIZE);
    }
    Stack(int size){
        arr=new int[size];
        top=-1;
    }
    public boolean push(int val) {
        if(isFull()){
            System.out.println("stack is fulled");
            return false;
        }
        arr[++top]=val;
        return true;
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        return arr[top];
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        return arr[top--];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull() {
        return top==arr.length-1;
    }
}
