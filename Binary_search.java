public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {-455,-45,-8,0,100, 200,345,432,689,754,852,908,1002};
        int target = 100;
        System.out.println(search(arr,target)+1);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end) / 2;
        // better way to find the mid that doesnot exceed the int value
        //int mid=start+(end-start)/2
        while(start<=end) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            } else {
                start = mid+1;
            }
            mid=(start+end)/2;

        }
        return -1;
    }
}