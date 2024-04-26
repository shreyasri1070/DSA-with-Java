package Recursion;

public class pallindrome {
    public static void main(String[] args) {
        System.out.println(pal(123));

    }
    static boolean pal(int n){
        return n==rev1(n);

    }
    static int rev1(int n){
        int digits=(int)(Math.log10(n));
        return helper(digits,n);
    }
    static int helper(int digits,int n){
        if(n/10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits)+helper(digits-1,n/10);
    }
}
