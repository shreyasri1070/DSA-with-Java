package Recursion;

import java.util.ArrayList;

public class linear_search {
    public static void main(String[] args) {
        int[]arr={234,56,89,45,45,34,45,65};
//        multipleoccur(arr,45,0);
//        System.out.println(num);
        //System.out.println(search(arr,89,0));
//        ArrayList<Integer>num=new ArrayList<>();
//        System.out.println(searchlist(arr,45,0,num));// another way of creating the arraylist in the function
        System.out.println(searchlist2(arr,45,0));

    }
    static int search(int []arr,int key,int index){
        if(index==arr.length-1){
            return -1;
        }
        if(arr[index]==key){
            return index;
        }
       return search(arr,key,index+1);
    }

    static ArrayList<Integer>num=new ArrayList<>();
    static void multipleoccur(int []arr,int key,int index){

        if(index==arr.length-1){
            return ;
        }
        if(arr[index]==key){
            num.add(index);
        }
        multipleoccur(arr,key,index+1);
    }

    static ArrayList<Integer>searchlist(int[] arr,int key,int index,ArrayList<Integer>num){

        if(index==arr.length-1){
            return num;
        }
        if(arr[index]==key){
            num.add(index);
        }
        return searchlist(arr,key,index+1,num);

    }

    //another way of doing the same question in this array list is newlwy created at every function call and that function call return the list and at returning time list is added to the previous list in tree representation
    static ArrayList<Integer>searchlist2(int[] arr,int key,int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length-1){
            return list;
        }
        if(arr[index]==key){
            list.add(index);
        }
        ArrayList<Integer>ansfromallcall=searchlist2(arr,key,index+1);
        list.addAll(ansfromallcall);
        return list;

    }

}
