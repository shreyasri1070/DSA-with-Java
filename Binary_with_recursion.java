public class Binary_with_recursion {
    public static void main(String[] args) {
        int[]arr={22,34,56,67,68,98,100};
        int target=100;
        System.out.println(search(arr,target,0,arr.length-1));

    }
    static int search(int []arr,int target ,int start,int end){


        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        else if(arr[mid]==target ){
            return mid;
        }
        else if(arr[mid]>target){
            return search(arr,target,start,mid-1);
        }
        else if( arr[mid]<target){
          return   search(arr,target,mid+1,end);
        }
        return 0;
    }
}
