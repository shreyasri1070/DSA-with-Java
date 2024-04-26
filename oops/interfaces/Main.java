package oops.interfaces;

public class Main {
    public static void main(String[] args) {
      //  Car car=new Car();
//      engine car1=new Car();
//        car1.a;--error

//        car.acc();
//        car.start();
//        car.stop();
//        Media carmedia=new Car();
//        carmedia.stop();

        Nicecar car= new Nicecar();
        car.start();
        car.startMusic();
        car.updrageElectric();
    }
}
