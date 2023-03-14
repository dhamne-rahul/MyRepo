package Math;
public class SinngleNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        System.out.println(findSingle(arr));
    }
    public static int findSingle(int[] arr)
    {
        int ans=0;
        for(int i:arr)
        {
            ans^=i;
        }
        return ans;
    }
}
