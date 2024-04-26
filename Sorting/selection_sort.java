package Sorting;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {

        int[]arr={2,1};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[]arr){
        for(int i=0;i<arr.length;i++){
          int max= maxindex(arr,0,arr.length-i-1);
          swap(arr,max,arr.length-i-1);
        }

    }

    static int maxindex(int[]arr,int start,int last){
        int max=start;
        for(int i=0;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }return max;

    }
    static void swap(int[]arr,int max,int last){
        int temp;
        temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
