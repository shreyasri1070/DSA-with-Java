package oops;

public class wrapper {
    public static void main(String[] args) {
//     int a=10;
//        int b=20;
    // Integer num=42;
     // it used to wrap primitive data types such that as int ,char etc into objects.

        Integer a=10;
        Integer b=20;
        swap(a,b);
        System.out.println( a+" is swapped with "+b);
        //final is used as the constant and it used to prevent to get modified-- final has covention of captial wriiten  --final int INCREASE
        // A lways initialise while declaring...
        // this imutability is only hold for primitive
//        final int bonus=2;
//        bonus=3; //error
        final A kunal=new A("kunal kushwaha");

        kunal.name="other";
        //when a non primitive is final  ,you cannot reassign it
                //kunal=new A("others");
        A obj=new A("rabgygfv");
        System.out.println(obj);
//        for(int i=0;i<100000000;i++){
//            obj=new A("Random name");
//        }

    }
    static  void  swap(Integer a,Integer b){ // primitive data type above a and b is not passed here as it is not referenced
        // wrapper class has final keyword that's why it get prevented to modified
        Integer temp=a;
        a=b;
        b=temp;

    }



}
class A{
    final int num=10;
    String name;

    public A(String name){
      //  System.out.println("object is created");
        this.name=name;
    }
    //  @Override
//    protected void finalize() throws Throwable {
//        System.out.println("object is destroyed");
//    }
}
