import java.util.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[]arr={12,345,2,6,0,7869,-1234};
       even(arr);
    }

    static void even(int[]arr){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                System.out.println(arr[i]+" contains 1 digits(odd number of digits)");
                continue;
            }
             int n=arr[i];

             int digit=0;
             while(n!=0) {
                 n = n / 10;
                 digit++;
             }
           if(digit%2==0){
               System.out.println(arr[i]+" contains "+digit +" digits(Even number of digits)");
           }
           else{
               System.out.println(arr[i]+" contains "+digit +" digits(odd number of digits)");
           }
        }
    }
}
