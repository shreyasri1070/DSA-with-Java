
public class linear_search {
    public static void main(String[] args) {
        int[] arr = {100, 36, 78, 908, 775, 897};
        int target = 775;
        int result = search(arr, target);
        System.out.println(result);

    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return (i + 1);
            }
// ENHANCED FOR LOOP IN WHICH ELEMENT IS USED TO PRINNT ONLY
//            for (int  element:arr
//                 ) {            if (element == target) {
//                return element;
//            }

 //           }


        }
return -1;
    }
}