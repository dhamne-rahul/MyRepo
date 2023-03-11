package Recursion;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,73,73,22,73,57,73};
        int target=73;
        // ArrayList<Integer>a=multipleOcc1(arr, target,0,new ArrayList<Integer>());
        ArrayList<Integer>a=search1(arr, target,0);
        System.out.println(a);
    }
    public static ArrayList<Integer> search1(int[] arr,int target,int i)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(i==arr.length-1)
        {
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        ArrayList<Integer> listFromBelowCalls=search1(arr, target, i+1);
        list.addAll(listFromBelowCalls);
        return list;
    }
    public static ArrayList<Integer> multipleOcc1(int[] arr,int target,int i,ArrayList<Integer>list)
    {
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target)
        {
            list.add(i);
        }
        return multipleOcc1(arr, target, i+1,list);
    }
    static ArrayList<Integer>ans=new ArrayList<>();
    public static void multipleOcc(int[] arr,int target,int i)
    {
        if(i==arr.length){
            return;
        }
        if(arr[i]==target)
        {
            ans.add(i);
        }
        multipleOcc(arr, target, i+1);
    }
    public static int search(int[] arr,int target,int i)
    {
        if(i==arr.length)
        {
            return -1;
        }
        if(arr[i]==target)
        {
            return i+1;
        }
        return search(arr, target, i+1);
    }
}
