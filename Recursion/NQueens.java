package Recursion;

public class NQueens {
    public static void main(String[] args) {
        int n=5;
        boolean [][] board=new boolean[n][n];
        queens(board,0);
    }
    static int queens(boolean[][]board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        // Placing the queen in the board
        int count =0;
        for(int col=0;col<board[0].length;col++){

            if(issafe(board,row,col)){
                board[row][col]=true;
                count=count+queens(board,row+1);
                board[row][col]=false;
            }
        }

return count;

    }
            public static boolean issafe(boolean[][]board,int row,int col){
                // column check int vertical direction
                for(int i=0;i<row;i++){
                   if(board[i][col]){
                       return false;
                   }
                }
                //diagonal left
                int maxleft =Math.min(row,col);
                for(int i=1;i<=maxleft;i++){
                    if(board[row-i][col-i]){
                        return false;
                    }
                }
                int maxright =Math.min(row, board.length-col-1);
                for(int i=1;i<=maxright;i++){
                    if(board[row-i][col+i]){
                        return false;
                    }

                }
                return true;

            }

    static void display(boolean [][]board){
     for( boolean [] row:board){
         for(boolean element :row){

             if(element){
                 System.out.print("Q ");
             }
             else{
                 System.out.print("X ");
             }

         }
         System.out.println();

     }
    }

}
