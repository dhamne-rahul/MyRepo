package Recursion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZeros1(111, 0));
    }
    public static int countZeros1(int n,int count)
    {
        if(n<=0)
        {
            return count;
        }
        int rem=n%10;
        if(rem==0)
        {
            return countZeros(n/10, count+1);
        }
        return countZeros(n/10, count);
    }
    public static int countZeros(int n,int count)
    {
        if(n<=0)
        {
            return count;
        }
        int rem=n%10;
        if(rem==0)
        {
            count+=1;
        }
        return countZeros(n/10, count);
    }
}
