public class SearchInRange {
    public static void main(String[] args) {
        // range is given to search the element
        int[] arr = {100, 36, 78, 908, 775, 897};
        int target = 775;
        int start=3;
        int end =6;
        int result = search(arr, target,start,end);
        System.out.println(result);

    }
    static int search(int[] arr, int target , int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i<=end; i++) {
            if (arr[i] == target) {
                return (i + 1);
            }
        }
        return 0;
    }
}
