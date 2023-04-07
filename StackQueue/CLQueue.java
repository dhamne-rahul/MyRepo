package StackQueue;

public class CLQueue {
    protected int[] data;
    protected static final int DEFAULT_SIZE=10;
    int size=0;
    int front =0;
    int end=0;

    CLQueue(){
        this(DEFAULT_SIZE);
    }
    CLQueue(int size){
        data=new int[size];
    }
    public void insert(int val){
        if(isFull()){
            System.out.println("clq is full");
        }
        data[end++]=val;
        end=end%data.length;
        size++;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("q is empty");
        }
        int removed=data[front];
        front++;
        front=front%data.length;
        size--;
        return removed;

    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("q is empty");
        }
        return data[front];

    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i=front;

        do{
            System.out.print(data[i++]+"->");
            i=i%data.length;
        }while(i!=end);
        System.out.print("END");
    }
    private boolean isEmpty() {
        return size==0;
    }
    private boolean isFull() {
        return size==data.length-1;
    }

}
