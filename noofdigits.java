public class noofdigits {
    public static void main(String[] args) {
        int a=128;
        int b=2;

        int ans=(int)(Math.log(a)/Math.log(b))+1;
        System.out.println(ans); // log a complexity;
    }
}
