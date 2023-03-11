package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(25434));
    }
    public static int sum(int n){
        if(n<10){
            return n;
        }
        return (n%10)+sum(n/10);
    }
}
