package Recursion;
// not understand properly -- some cconditions
public class kNights {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board=new boolean[n][n];
        Knights(board,0,0,4);

    }
    public static void Knights(boolean[][]board,int row,int col,int knight){
        if(knight==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board.length){
            return;
        }
        //place the knights
        if(col== board.length){
            Knights(board,row+1,0,knight);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            Knights(board ,row,col+1,knight-1);
            board[row][col]=false;
        }

        Knights(board ,row,col+1,knight);

    }
    public static boolean isSafe(boolean[][]board,int row,int col){
            if(isValid(board,row,col)){
                if(board[row][col]){
                    return false;
                }
            }
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        } if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        } if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }

        }
        return true;


    }
    public static boolean isValid(boolean[][]board,int row,int col){
        if(row>=0&&row<board.length&&col>=0 && col<board.length){
            return true;
        }
        return false;
    }

    public static void display(boolean[][]board){
        for(boolean []row:board){
            for(boolean element :row){
                if(element){
                    System.out.print("k ");
                }
                else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

}
