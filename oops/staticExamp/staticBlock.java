package oops.staticExamp;
//this is a demo to show initialisation of static variables
public class staticBlock {
    static int a=4;
    static int b;
    //will only run once,when the first obj is create i.e when the class is loaded for runkk
    static{
        System.out.println(
                "This is static block"
        );
        b=a*2;
    }

    public static void main(String[] args) {
      //  staticBlock obj=new staticBlock();
        System.out.println(staticBlock.a +" "+staticBlock.b);
    }
}
