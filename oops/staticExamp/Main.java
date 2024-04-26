package oops.staticExamp;

public class Main {
    public static void main(String[] args) {
        // we don't
//        Human shreya=new Human(21,"Shreya",50000,false);
//        Human priya=new Human(25,"Priya",80000,false);
//        System.out.println(shreya.married);
          //  greet() -- non static method is not reference in static method because it belonged to object and static method can't reference from object
    }
    //this is not dependent on objects
    static void fun(){
      //  greet(); // you cant use this because it requires an instance
        //but the function you are using it in does not depend on instance

        // you cannot  access non-static stuff without referencing their instances in a static context
        //hence ,here I am referencing it
        Main  obj =new Main();
        obj.greet();

    }
    void greet(){
        fun();
        System.out.println("dh");
    }

}
