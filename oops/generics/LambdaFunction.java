package oops.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(i+1);
            
        }
       // arr.forEach((item)-> System.out.println(item*2));
        Consumer<Integer> fun=(item)-> System.out.println(item*2);
        arr.forEach(fun);
        Operation sum= Integer::sum;
        Operation product=(a,b)->a*b;
        Operation subtraction=(a,b)->a-b;

        LambdaFunction mycalculator=new LambdaFunction();
        System.out.println(mycalculator.operate(5,3,sum));
        System.out.println(mycalculator.operate(5,3,product));
        System.out.println(mycalculator.operate(5,3,subtraction));


    }
   private int operate(int a,int b,Operation op){
        return op.operation(a,b);
   }
}
interface Operation{
    int operation(int a,int b);
}
