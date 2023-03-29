package OOPS;
class Student{
    public String name;
    public int age;
    //constructor:
    Student()
    {
        //calling constructor form another constructor.
        this("rahul dhamne", 23);
    }
    Student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    //copy constructor:
    Student(Student other)
    {
        this.name=other.name;
        this.age=other.age;
    }
    void display(){
        System.out.println("my name is "+this.name +" i am "+this.age+"old");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyed");
    }
}
public class StudentInfo {
    public static void main(String[] args) {
        // Student kunal=new Student();
        // System.out.println(kunal.age);
        // System.out.println(kunal.name);
        // kunal.age=22;
        // kunal.name="Kunal Kushwaha";
        // System.out.println(kunal.age);
        // System.out.println(kunal.name);
        // Student kunal=new Student("kunal Kushwaha", 22);
        // System.out.println(kunal.age);
        // System.out.println(kunal.name);
        // Student ram=new Student(kunal);
        // kunal.display();
        // ram.display();
        // Student rahul=new Student();
        // System.out.println(rahul.name);
        Student a;
        for(int i=1;i<1000000;i++)
        {
            a=new Student();
        }
        
    }
}
