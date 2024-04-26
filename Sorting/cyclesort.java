package Sorting;

import java.util.Arrays;

public class cyclesort {
    public static void main(String[] args) {
       int []arr={9,4,6,2,1,8,5,3,7,0};
       search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[]arr){//it only worked for positive value
//        int i=0;
//        while( i<arr.length){
//            if(arr[i]-1!=i){
//                swap(arr,arr[i]-1,i);
//            }
//            else{
//                i++;
//            }
        int i=0;
        while(i<=arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[]arr,int max,int last){
        int temp;
        temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }
}
