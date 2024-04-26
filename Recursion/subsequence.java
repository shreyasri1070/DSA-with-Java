package Recursion;

import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        //subseq("","abc");
        int [] arr={1,2,3};
        List<List<Integer>> ans=substringiteraative(arr);

for( List <Integer>li :ans){
        System.out.println(li
);}

    }
    public static void subseq(String p ,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
       subseq(p,up.substring(1));
        subseq(ch+p,up.substring(1));

    }
//Return an ArrayList of a string
    public static ArrayList<String> subseqarraylist(String p , String up){

        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseqarraylist(p,up.substring(1));
        ArrayList<String>right= subseqarraylist(ch+p,up.substring(1));
        left.addAll(right);
        return left;

    }

    // subset with ascii value

    public static void subseqascii(String p ,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        subseqascii(p,up.substring(1));
        subseqascii(ch+p,up.substring(1));
        subseqascii(p+(ch+0),up.substring(1));


    }

    // iterative  program to form subsequences

    static  List<List<Integer>> substringiteraative(int []arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int nums :arr){
            int n =outer.size();
            for (int i = 0; i < n; i++){
               List internal=new ArrayList<>(outer.get(i));
                internal.add(nums);
                outer.add(internal);
            }
        }
        return outer;
    }


    // subsequence of string with duplicate element
 //   static  List<List<Integer>> substringduplicate(int [] arr){
//        Arrays.sort(arr);
//        List<List<Integer>> outer=new ArrayList<>();
//        outer.add(new ArrayList<>());
//        int start=0;
//        int end=0;
//       for(int j=0;j<arr.length;j++){
//           if(j<0&& arr[j-1]!=arr[j]){
//            int n =outer.size();
//            for (int i = 0; i < n; i++){
//                List internal=new ArrayList<>(outer.get(i));
//                internal.add(arr[j]);
//                outer.add(internal);}
//            }
//           else{
//               int n =outer.size();
//               for (int i = 0; i < n; i++){
//                   List internal=new ArrayList<>();
//                   internal.add(arr[j]);
//                   outer.add(internal);}
//           }
//           }
//
//        }
//        return outer;
  //  }
}
