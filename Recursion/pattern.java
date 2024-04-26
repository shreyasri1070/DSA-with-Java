package Recursion;

public class pattern {
    public static void main(String[] args) {
        triangle(4,4);
    }

static void triangle(int row,int col) {
        if(row==0 ){
            return;
        }
    if (row > 0) {
        if (col > 0) {
            System.out.print("*  ");
            triangle(row, col - 1);
        } else {
            System.out.println();
            triangle(row - 1, row - 1);

        }
    }

}


}

