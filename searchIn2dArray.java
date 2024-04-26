import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {12, 45, 34, 87}, {-7, 0, 5, 6}, {76, 89, 34}};
        int target = -7;
        int[]ans=search(arr,target);//format of return of a array having two element row and column
        System.out.println(Arrays.toString(ans));
        //  System.out.println(arr.length); is the no of the  rows
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {  // it gives the length of row which is equal to the length of array
            for (int j = 0; j < arr[i].length; j++) {//it gives the length of each coolumn according to  that  row
                if (arr[i][j] == target) {
                    return new int[]{i+1, j+1}; // if array start with  index 1
                }

            }
        } return new int[]{-1,-1};
    }
}
// find the max value in 2-d array using enhanced for loop