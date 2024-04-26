package Recursion;

public class reverse {
    public static void main(String[] args) {
//        rev(1324);
//        System.out.println(sum);
        System.out.println(rev1(1324));

    }
static int sum=0;
    static void rev(int n) {
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev(n/10);

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