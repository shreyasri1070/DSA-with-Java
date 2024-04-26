package Recursion;

public class productofdigits {
    public static void main(String[] args) {
        System.out.println(producct(13204));
    }
    static int producct(int n){
        if(n%10==n){
            return n;
        }
        int t=n%10;
        n=n/10;
        return t* producct(n);

    }
}
