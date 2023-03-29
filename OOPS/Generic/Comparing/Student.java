package OOPS.Generic.Comparing;

public class Student implements Comparable<Student> {
    public int roll;
    public int marks;
    Student(int roll,int marks)
    {
        this.marks=marks;
        this.roll=roll;
    }
    @Override
    public int compareTo(Student o) {
        int diff=this.marks-o.marks;

        return diff;
    }

    
}
