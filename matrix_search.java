import java.util.Arrays;

public class matrix_search {
    public static void main(String[] args) {
        int [][] arr={{ 23,26,27,67},{25,28,29,69},{26,29,30,70}
        };
        int target=69;
        System.out.println(Arrays.toString(search(arr, target)));

    }
  static int[]search(int[][]arr,int target){
        int row=0;//row strating from
        int column=arr[1].length-1;   //kcolum starting from
      while(row<arr.length&&column>0){
          if(arr[row][column]==target){
              return new int[]{row+1,column+1};
          } else if (arr[row][column]>target) {
                   column--;

          }
          else{
              row++;
          }

      }

return new int[]{-1,-1};
  }
}
