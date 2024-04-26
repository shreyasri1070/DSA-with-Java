package Recursion;

public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(Sum(1324));
    }
    static int Sum(int n){
        if(n==0){
            return 0;
        }
        int t=n%10;
        n=n/10;
        return t+Sum(n);

    }
}
