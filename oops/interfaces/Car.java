package oops.interfaces;

public class Car implements engine,Brake,Media {
int a=32;
    @Override
    public void brake() {
        System.out.println(
                "brake car"
        );
    }

    @Override
    public void start() {
        System.out.println("start car engine");
    }

    @Override
    public void stop() {
        System.out.println("stop the car engine");

    }

    @Override
    public void acc() {
        System.out.println("accelerate the speed");
    }
}
