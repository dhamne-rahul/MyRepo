package OOPS.Generic;

import java.util.Arrays;

public class CustomArrayList<T> {
    private Object[] arr;
    private static int DEFAUT_SIZE=10;
    private int size=0;
    
    CustomArrayList()
    {
        this.arr=new Object[DEFAUT_SIZE];
    }
    public void add(T e)
    {
        if(isFull())
        {
            reSize();
        }
        arr[size++]=e;
    }
    public boolean isFull() {
        return size==arr.length;
    }
    private void reSize() {
        Object[] temp=new Object[2*arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];
        }
        arr=temp;
    }
    public Object remove()
    {
        return arr[size--];
    }
    public int size()
    {
        return size;
    }
    public Object get(int index)
    {
        return arr[index];
    }
    public void set(int index,T val)
    {
        arr[index]=val;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Your ArrayList is :"+Arrays.toString(arr)+" and its size is : "+size;
    }
}
