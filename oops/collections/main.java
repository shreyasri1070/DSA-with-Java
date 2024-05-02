package oops.collections;

import java.util.*;

public class main {
    public static void main(String[]args){
        List<Integer>list=new ArrayList<>();
        List<Integer>list2=new LinkedList<>();
        list2.add(34);
        list2.add(67);
        List<Integer>vector=new Vector<>();
        vector.add(34);
        vector.add(78);
        System.out.println(vector);
        //vector is same as arraylist but synchronised
        //Arraylist is faster
    }
}
