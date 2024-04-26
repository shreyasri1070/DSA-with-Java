package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
     int[]arr={};
     sort(arr);
        System.out.println(Arrays.toString(arr));
    }
static void sort(int[]arr){
    boolean swapped;
        for( int i=0;i<arr.length-1;i++){
           swapped=false;
            for(int j=0;j<arr.length-i-1;j++){
                int temp;
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            // if you did not swap for a particular value of i, it means the array  is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
}

}
