package oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private  int []data;
    private static int DEFALUT_SIZE=10;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFALUT_SIZE];

    }

    private void add(int num){
        if(isFull()){
            resize();
        }
        this.data[size++]=num;

    }
   public int  remove(){
        int removed =data[--size];
        return removed;

    }
    public int get(int index){
        return data[index];
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }
    private void resize() {
        int [] temp=new int[data.length*2];
        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==DEFALUT_SIZE;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArraylist{ data" + Arrays.toString(data)+",size= "+size+"}";
    }

    public static void main(String[] args) {
      //  ArrayList list=new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,345);
//        list.size();
//        list.isEmpty();

        CustomArrayList list=new CustomArrayList();
        list.add(3);
        list.add(4);
        list.add(8);
        System.out.println(list);
    }
}
