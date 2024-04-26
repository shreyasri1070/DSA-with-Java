package Recursion;

public class count_zeroes {
    public static void main(String[] args) {
        System.out.println(no( 100000001));

    }
    static int no(int n){
        if(n==0){
            return 1;
        }
        int c=0;
        return helper(n , c);
    }
    static int helper(int n,int c) {

        if (n / 10 == n) {
            return c;
        }
        if (n % 10 == 0) {
            return helper(n / 10, c + 1);
        } else {
            return helper(n / 10, c );
        }

    }
}
