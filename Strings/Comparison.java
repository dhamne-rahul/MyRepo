package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a="rahul";
        String b="rahul";
        System.out.println(a==b);//because b will not create new object it will just point to a.
        System.out.println(a.equals(b));//.equals method only take care about values not referance.
        String c=new String("sagar");
        String d=new String("sagar");
        System.out.println(c==d);//false.
        System.out.println(c.equals(d));//true; 
        System.out.println(a.charAt(0));
    }
}
