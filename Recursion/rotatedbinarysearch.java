package Recursion;

public class rotatedbinarysearch {
    public static void main(String[] args) {
        int []arr={5,6,8,9,1,2,3};
        System.out.println(search(arr,3,0,arr.length-1));

    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int  mid=start+(end-start) /2;
        if(arr[mid]==target){
            return mid;
        }
        //check if mid is left side sorted
        if(arr[start]<=arr[mid]){
            if(arr[start]<=target && arr[mid]>=target){
               return  search(arr,target,start,mid-1);
            }
            else{
                return  search(arr,target,mid+1,end);
            }
        }
        // check if the mid is on the right side sorted

        if(arr[mid]>=target&&target<=arr[end]){
            return  search(arr,target,mid+1,end);
        }
        else {
            return search(arr, target, start, mid - 1);

        }
    }
}
