package oops.generics;

import java.util.Arrays;
import java.util.List;

// it restrict the type of variable in number
//here T should be number or its subclass
public class wildcardExample<T extends Number>{
    private Object[]data;
    private static int DEFALUT_SIZE=10;
    private int size=0;

    public wildcardExample() {
        data = new Object[DEFALUT_SIZE];

    }

    public void getList (List<? extends Number> list){
        // do something
    }


    private void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;

    }
    public T  remove(){
        T removed =(T)(data[--size]);
        return removed;

    }
    public T get(int index){
        return (T)data[index];
    }
    public void set(int index,T value)
    {
        data[index]=value;
    }
    private void resize() {
        Object [] temp=new Object[data.length*2];
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
        return "CustomgenArrayList{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    public static void main(String[] args) {
        //  ArrayList list=new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,345);
//        list.size();
//        list.isEmpty();

        wildcardExample<Integer> list=new wildcardExample<>();
        list.add(3);
        list.add(4);
        list.add(8);
        System.out.println(list);
    }
}
