public class Findunique {
    public static void main(String[] args) {
        int [] arr={3,5,4,6,9,3,5,9,4};
        System.out.println(check(arr));
    }
     static int check(int [] arr){
        int unique=0;
         for (int n:arr) {
             unique^=n;

         }
         return unique;
     }

}
