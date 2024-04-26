package oops.singleton;

public class Main {

    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        singleton obj1 = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        // same instance is refered to every objectt
    }
}
