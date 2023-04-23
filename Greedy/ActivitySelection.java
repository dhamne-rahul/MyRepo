package Greedy;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int ans=maxActivity(start,end);
        System.out.println(ans);
    }
    public static int maxActivity(int[] start,int[] end){
        int n=start.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(end[i-1]>=start[i]){
                count++;
            }
            else{
                continue;
            }
        }
        return count;
    }
}
