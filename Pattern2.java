public class Pattern2 {
    public static void main(String[] args) {
pattern6(4);

    }
    static void pattern(int n){
        for(int i=1;i<2*n;i++){
            //optimised solution
// int total  totalcolsInrow =row>n ? 2*n-row: row;
//            for(int k=0;k<totalclsrow;k++){
//                System.out.print("* ");
//            }
            if(i < n) {
                int j=0;
                while (j < i) {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
            }
                else
                {
                   for(int k=2*n-i;k>0;k--){
                       System.out.print("* ");
                   }

                    System.out.println();
                }
            }


        }

        static void pattern3(int n){

        int row;


           for( row =1;row<2*n;row++){
               int totalcolsInrow =row>n ? 2*n-row: row;
               int spaces =n-totalcolsInrow;
               for( int k=0;k<spaces;k++){
                   System.out.print(" ");
               }


               for(int k=0;k<totalcolsInrow;k++){
                   System.out.print("* ");
               }
               System.out.println();
           }




        }
        static void pattern4(int n){
        for(int row=1;row<=n;row++){

            int spaces =n-row;
            for( int k=0;k<spaces;k++){
                System.out.print("  ");
            }
            for(int col=row;col>0;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }

            System.out.println();
        }
        }

    static void pattern5(int n){
        for(int row=1;row<=2*n-1;row++){
           int totalspace=row>n? 2*n-row:row;
            int spaces =n-totalspace;
            for( int k=0;k<spaces;k++){
                System.out.print("  ");
            }

                for (int col = totalspace; col > 0; col--) {
                    System.out.print(col + " ");
                }
                for (int col = 2; col <= totalspace; col++) {
                    System.out.print(col + " ");
                }

            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int row=1;row<2*n;row++){
        for(int col=1;col<2*n;col++){
            //int index=Math.min(Math.min(row,col),Math.min(2*n-row, 2*n-col));
            int index=n-(Math.min(Math.min(row,col),Math.min(2*n-row, 2*n-col)));
            System.out.print(index+1+" ");
        }
            System.out.println();

        }

    }

    }

