package Recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int []arr={7,8,5,4,9};
        Divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergesort(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid=(arr.length)/2;
        int [] left=mergesort(Arrays.copyOfRange(arr,0,mid));//exclusive from last
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    static int[] merge(int[]first,int[]second){
        int i=0;
        int j=0;
        int k=0;
        int[] mix=new int[first.length+second.length];//new arr created every time different length
        while(i<first.length&&j<second.length){
            if(first[i]<=second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    //Inplace merge sort in which we don't need to create new objects of parts of array

    static void Divide(int[]arr, int start, int end){
        if(start>=end){//(start=end)
            return ;
        }
        int mid=(start+end)/2;// it may give space complexity overflow to integer range
        Divide(arr,start,mid);//exclusive from last
        Divide(arr,mid+1,end);
         Conquer(arr,start,mid,end);

    }

    static void Conquer(int []arr, int s, int m, int e){
        int i=s;
        int j=m+1;
        int k=0;
        int[] mix=new int[e-s+1];//new arr created every time different length
        while(i<= m && j<= e){
            if(arr[i]<=arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<=e){
            mix[k]=arr[j];
            j++;
            k++;
        }
//     for(k=0;k<mix.length;k++){
//         arr[s+k]=mix[k]; //
//
//     }
        for(k=0,j=s;k<mix.length;k++, j++){arr[j]=mix[k];}
    }


}
