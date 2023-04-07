package StackQueue;
public class CustomStack {
    private int[] arr;
    public static final int DEFALULT_SIZE=10;
    public int top;

    CustomStack(){
        this(DEFALULT_SIZE);
        this.top=-1;
    }
    CustomStack(int size){
        arr=new int[size];
    }
    public boolean push(int val)
    {
        if(isFull()){
            System.out.println("stack is fulled");
            return false;
        }
        arr[++top]=val;
        return true;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("can not pop ");
        }
        return arr[top--];
    }
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull() {
        return top==arr.length-1;
    }


}
