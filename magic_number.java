public class magic_number {
    public static void main(String[] args) {
        int n=6;
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1 ;//last digit
            n=n>>1;// removing the last digit
            ans+= last*base;
            base=base*5;
        }
        System.out.println(ans);
    }
}
