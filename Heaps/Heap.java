package Heaps;

import javax.xml.transform.Source;

// import java.util.Arrays;

public class Heap {

    public int[] arr=new int[50];
    public int size;

    Heap()
    {
        arr[0]=-1;
        this.size=0;
    }
    public void insert(int val)
    {
        
        size=size+1;
        int index=size;
        arr[index]=val;

        //swap with its parent till not satisfing the heap property.
        while(index>1)
        {
            int parent=index/2;
            if(arr[parent]<arr[index])
            {
                swap(arr,index,parent);
                index=parent;
            }
            // if it follows the heap property the return from it
            else{
                return ;
            }
        }
    }
    public void swap(int[] arr, int i, int parent) {
        int temp=arr[parent];
        arr[parent]=arr[i];
        arr[i]=temp;
    }
    public void delete()
    {
        // check if array is empty:
        if(size==0)
        {
            System.out.println("Nothing to delete");
            return ;
        }
        //swap first and last element:
        arr[1]=arr[size];
        size--;
        int i=1;
        while(i<size){
            int left=2*i;
            int right=(2*i)+1;
            int maxlr=arr[left]>arr[right]?left:right;
            swap(arr, i, maxlr);
            i=maxlr;
        }

    }
    public void heapify(int[] arr,int n,int i){
        int largest=i;
        int left=i*2;
        int right=i*2+1;
        if(left<n && arr[largest]<arr[left]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(arr, largest, left);
            heapify(arr, n, largest);
        }
        else{
            return;
        }
    }
    public void heapSort(int[] arr,int n){
        int size=n;
        while(size>1){
            swap(arr, size, 1);
            size--;
            heapify(arr, size,1);
        }

    }    
    public void printarr()
    {
        for(int i=1;i<=size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        // printarr(arr);
        int[] arr={-1,54,53,55,52,50};
        Heap h=new Heap();
        int n=5;
        for(int i=(n/2);i>0;i--)
        {
            h.heapify(arr, n, i);
        }
        System.out.println("heaps");
        for(int i=1;i<=n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        h.heapSort(arr, n);
        for(int i=1;i<=n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        // h.insert(10);
        // h.insert(5);
        // h.insert(3);
        // h.insert(2);
        // h.insert(4);
        // // h.insert(10);
        // h.insert(100);
        // h.delete();
        // h.delete();
        // h.printarr();
    }
}
