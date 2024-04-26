package oops.principles.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box=new Box(2 );
//        Box box1=new Box(box);
//        System.out.println(box.l+ " "+box.w+" "+box.h);
//        System.out.println(box1.l+ " "+box1.w+" "+box1.h);


//            Boxweight box2=new Boxweight();
//        Boxweight box3=new Boxweight( 2,5,3,4);
//        System.out.println(box2.weight+""+box2.l);

       // Box box4=new Boxweight(2,4,5,7);
       // System.out.println(box4.weight);
        //but can access the weight varible of child class

        //there are many variables in both parent and child classes
        //you are given access to variables that are in ref type i.e,Boxweight
        //hence,you should have access to weight  variable
        //this also means,that the ones you are trying to acess should be initalised
        //but here,when the obj itself is of type parent class ,how will you call  constructor of child class
       // Boxweight box6=new Box();


        //Mutlilevel
        Boxprice box=new Boxprice();

    }

}
