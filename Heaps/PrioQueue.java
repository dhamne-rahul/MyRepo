package Heaps;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioQueue{
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        // //In java by default priority queue is MIN-HEAP.
        // // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // pq.add(50);
        // pq.add(40);
        // pq.add(45);
        // pq.add(10);
        // System.out.println(pq.peek());
        // while(!pq.isEmpty())
        // {
        //     System.out.print(pq.peek()+" ");
        //     pq.poll();
        // }


        // int[] arr={20,10,60,30,50,40};
        // System.out.println();
        // System.out.println(findKthLargest(arr, 3));

        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(50);
        pq.add(40);
        pq.add(22);
        System.out.println(pq.spliterator());
        // System.out.println(pq);
        pq.poll();
        // System.out.println(pq);
    }
    public static int findKthLargest(int[] arr,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        int count=1;
        while(count<k)
        {
            pq.poll();
            count++;
        }
        return pq.peek();
    }
    
}