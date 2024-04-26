import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
 //      int j=0;
//        for( int i=2; i<n;i++){
//            if(n%i==0){
//                j=j+1;
//            }}
//           if(j==0){
//               System.out.println(n+" is a prime number");
//           }
//           else{
//               System.out.println(n+" is not a prime number");
//           }
        int j=2;


        while(j!=n) {
            int  k=0;
            for (int i =2; i<j;i++) {
                if(j%i==0){
                  k=k+1;
                }
            }

            if(k==0){
                System.out.println( j + "is prime number");
            }
            else{
                System.out.println(j +"is not a prime number");
            } j=j+1;
        }
    }
    }

