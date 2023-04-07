package StackQueue;

public class DyanamicQueue extends CustomQueue{
    DyanamicQueue(){
        super();
    }
    DyanamicQueue(int size){
        super(size);
    }
    @Override
    public boolean add(int e) throws Exception {
        // TODO Auto-generated method stub
        if(isFull()){
            int[] temp=new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            arr=temp;
        }
        return super.add(e);
    }
}
