package Recursion;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int []arr={23,34,12,37,1};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    // doubt selection sort dry run
    static void sort( int []arr,int row,int col) {
        if (row ==0) {
            return;
        }int max=0;
        if (col <row) {
            if(arr[col]>arr[max]){
                max=col;
            }
            sort2(arr,row, col + 1);


        }
        else {
            int temp =arr[row];
            arr[row]=arr[max];
            arr[max]=temp;

            sort2(arr,row - 1, 0);


        }
    }

    //bubble sort sorted at last index && each elemnt is compared

    static void sort2( int []arr,int row,int col) {
        if (row ==0) {
            return;
        }
            if (col <row) {
                if(arr[col]>arr[col+1]){
                    int temp =arr[col];
                    arr[col]=arr[col+1];
                    arr[col+1]=temp;
                }
                sort2(arr,row, col + 1);
            } else {

                sort2(arr,row - 1, 0);


        }
    }
}
