package oops.AbstractClass;

public abstract class parent {
    int age;
    public parent(int age) {
        this.age=age;
    }
    static void greet(){

        System.out.println("heyy");
    }
    abstract void career();
    abstract void partner();

}
