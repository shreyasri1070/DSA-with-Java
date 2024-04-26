import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        //number of rows and column are equaal
//        System.out.println("Enter the number of rows/columns:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i,j;
//        for(i=0;i<n;i++){
//            for(j=0;j<n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
      //  }

        // UnEqual number of rows and columns
//        System.out.println("Enter the number of columns:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println("Enter the number of rows:");
//        int m=sc.nextInt();
//        int i,j;
//        for(i=0;i<n;i++){
//            for(j=0;j<m;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//          }

        //print the patterns with number of each rows
//        System.out.println("Enter the number of rows/columns:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i,j;
//        for(i=0;i<n;i++){
//            for(j=0;j<n;j++){
//                System.out.print(i+1);
//            }
//            System.out.println();
//          }

        //PRINT THE PATTERN OF NUMBER OF COLOUMS
//        System.out.println("Enter the number of columns:");
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int i,j;
//        for(i=0;i<n;i++){
//            for(j=0;j<n;j++){
//                System.out.print(j+1);
//            }
//            System.out.println();
//          }
        //PRINT THE PATTERN OF value NUMBER OF COLOUMS in revrse
        System.out.println("Enter the number of columns:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}
