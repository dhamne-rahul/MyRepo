package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencing {
    static class Job implements Comparator<Job>{
        int deadline;
        int profit;
        int id;

        Job(int deadline,int profit,int id){
            this.deadline=deadline;
            this.profit=profit;
            this.id=id;
        }

        @Override
        public int compare(Job o1, Job o2) {
            // return o1.profit-o1.profit;for ascending order sorting.
            return o2.profit-o1.profit;//for descending order
        }
    
    }
    public static void main(String[] args) {
        int[][] jobInfo={
            {4,35},
            {1,10},
            {1,40},
            {1,30}
        };
        ArrayList<Job>arr=new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            arr.add(new Job(jobInfo[i][0], jobInfo[i][1], i));
        }
        Collections.sort(arr,(obj1,obj2)->obj2.profit-obj1.profit);
        ArrayList<Integer>seq=new ArrayList<>();
        int profit=0;
        int time=0;
        for(int i=0;i<arr.size();i++){
            Job curr=arr.get(i);
            if(curr.deadline>time){
                profit+=curr.profit;
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println(profit);

    }

    
}
