package oops.objectCloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal=new Human(34,"kunal kushwaha");
       // Human twin =new Human(kunal); // It take lots of processing time

        Human twin =(Human)kunal.clone();
        System.out.println(twin.age + " "+twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        twin.age=56;
        System.out.println(twin.age);
        System.out.println(kunal.age);
        System.out.println(Arrays.toString(kunal.arr));  // kunal will also change by changing the twin object--shallow copy
    }
}
