package Strings;

public class Pallindrome {
    public static void main(String[] args) {
        String str="niti";
        if(isPallindrome(str)){
            System.out.println("Given String is Pallindrome");
        }
        else{
            System.out.println("Given string is not pallindrome");
        }
    }
    public static boolean isPallindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(end)!=s.charAt(start)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
