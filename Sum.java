package Basics;

public class Sum {
    public static void main(String[] args) {
        int ans=sum(10,20);
        System.out.println(ans);
        System.out.println(greeting("Rahul"));
        int a=10;
        int b=20;
        swap(a, b);
        System.out.println(a+" "+b);
    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static String greeting(String a){
        return "Hello "+a;
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
