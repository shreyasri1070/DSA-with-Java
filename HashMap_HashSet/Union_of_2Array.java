package HashMap_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Union_of_2Array {

    public static  int[] union(int[]arr1,int[]arr2){
        HashSet<Integer> set=new HashSet<>();


        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        int [] arr=new int[set.size()];
      int k=0;
        for(Integer ele:set){
            arr[k]=ele;
            k++;
        }
        return  arr;



    }


    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(Arrays.toString(union(arr1,arr2)));

    }

}

