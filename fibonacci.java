public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboformula(50));
    }
    static int fibo(int n){
        if(n==1||n==0){
            return n;
        }
        else
            return fibo(n-1)+fibo(n-2);
    }
    static int fiboformula(int n){
        //just for demo,use double
       // return (int)(((Math.pow((1+Math.sqrt(5))/2,n))-(Math.pow((1-Math.sqrt(5))/2,n)))/Math.sqrt(5));
        //remove the less dominating term and very close to zero
        return (int)(((Math.pow((1+Math.sqrt(5))/2,n)))/Math.sqrt(5));
    }
}
