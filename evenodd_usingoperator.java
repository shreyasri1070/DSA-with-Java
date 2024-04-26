public class evenodd_usingoperator
{
    public static void main(String[] args) {
    int n=67;
        System.out.println(isodd(n));
    }

    static Boolean isodd(int n){
        return (n & 1)==1;
    }
}
