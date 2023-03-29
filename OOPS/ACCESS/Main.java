package OOPS.ACCESS;

public class Main {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.getter());
        a.setter(50);
        System.out.println(a.getter());
    }
}
