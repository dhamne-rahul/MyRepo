package OOPS.Generic.Comparing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Student kunal=new Student(10, 998);
        // Student rahul=new Student(20,92);
        // if(kunal.compareTo(rahul)<0)
        // {
        //     System.out.println("rahul has more marks");
        // }
        // else{
        //     System.out.println("kunal has more marks");
        // }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            al.add(i+1);
        }
        al.forEach((items) -> System.out.println(items*2));
    }
}
