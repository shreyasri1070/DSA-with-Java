import java .util.Scanner;
public class pattern1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        //TYPE :6
//        System.out.println("Enter the number of columns:");
//       int n=sc.nextInt();
//       int i=0,k=0;
//               while(i<n){
//                   int j=0;
//                   while(j<n){
//                       k=k+1;
//                       System.out.print(k);
//                       j++;
//                   }i++;
//                   System.out.println();
          //     }
        //TYPE:7
//           INCREASING number PATTERN row start with row number  without third variabe
//        System.out.println("Enter the number of columns:");
//        int n=sc.nextInt();
//        int i=0;
//        while(i<n){
//            int j=0;
//             while(j<=i){
//            j++;
//                 System.out.print(i+j+" ");
//
//             }
//            System.out.println();
//             i++;
//        }
// TYPE:8;
        // INCREASING THE ROW PATTERN WITH ROW START+1 WHERE PERVIOUS ROW END
//        System.out.println("Enter the number of columns:");
//        int n=sc.nextInt();
//        int i=0,k=0;
//        while(i<n){
//            int j=0;
//            while(j<=i){
//                j++;
//                k=k+1;
//                System.out.print(k+" ");
//            }
//            System.out.println();
//            i++;
//        }
        // TYPE:9  DECREASING NUMBER IN THE ROW START WITH THE THAT NO. OF ROW

//        System.out.println("Enter the number of columns:");
//        int n=sc.nextInt();
//        int i=0;
//        while(i<=n){
//            int j=0;
//            while(j<i){
//                j++;
//                System.out.print(i-j+1+" ");
//            }
//            System.out.println();
//            i++;
//        }
    // TYPE:10 PRINT PATTERN WITH ALPHABET

//        System.out.println("Enter the number of columns:");
//        int n=sc.nextInt();
//        int i=0;
//         char ch='A';
//        while(i<n){
//            int j=0;
//            while(j<n){
//                //System.out.print((char)(65+i));
//                System.out.print(ch);
//
//                j++;
//            }
//            ch++;
//            System.out.println();
//            i++;
//        }
//TYPE:11 (A) PRINT THE ALPHABET IN INCREASING ORDER
//        System.out.println("Enter the number of columns:");
//        int n=sc.nextInt();
//        int i=0;
//        char ch='A';
//        while(i<n){
//            int j=0;
//            while(j<n){
//                //System.out.print((char)(65+i));
//                System.out.print(ch+" ");
//                ch++;
//                j++;
//            }
//
//            System.out.println();
//            i++;
//        }
       // (B) PRINT THE ALPHABET START WITH THE ROW  th NUMBER

        System.out.println("Enter the number of columns:");
        int n=sc.nextInt();
        int i=0;
        char ch='A';
        while(i<n){
            int j=0;
            while(j<n){
                System.out.print((char)(ch+i+j) +" ");

                j++;
            }

            System.out.println();
            i++;
        }





    }
}
