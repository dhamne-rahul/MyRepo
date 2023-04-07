package StackQueue;

public class CustomQueue {
    protected int[] arr;
    public int end=0;
    public static final int DEFALULT_SIZE=5;

    CustomQueue(){
        this(DEFALULT_SIZE);
    }
    CustomQueue(int size){
        arr=new int[size];
    }
    public boolean add(int e) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full you can not add");
        }
        arr[end++]=e;
        return true;
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty can not remove");

        }
        int removed=arr[0];
        for(int i=1;i<end;i++)
        {
            arr[i-1]=arr[i];
        }
        end--;
        return removed;
    }
    public int front()throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        return arr[0];
    }
    public boolean isFull(){
        return end==arr.length;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(arr[i] + " <- ");
        }
        System.out.println("END");
    }
}
