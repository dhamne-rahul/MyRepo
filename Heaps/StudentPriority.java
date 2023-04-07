package Heaps;

import java.util.PriorityQueue;

public class StudentPriority {
    static class Student implements Comparable<Student>{

        public String name;
        public int rank;

        Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student o) {
            return  this.rank-o.rank;
        }  
    }
    public static void main(String[] args) {
        Student s1=new Student("rahul", 2);
        Student s2=new Student("sagar", 4);
        Student s3=new Student("ketan", 6);
        Student s4=new Student("surekha", 7);
        Student s5=new Student("tejas", 1);
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        pq.add(s5);
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+  "  -> "+pq.peek().rank);
            pq.poll();
        }

        
    }
}
