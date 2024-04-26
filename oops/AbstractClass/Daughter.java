package oops.AbstractClass;

public class Daughter extends parent{
    public Daughter(int age) {
        super(age);
    }

    @Override

    void career() {
        System.out.println(" I want to become code");
    }

    @Override
    void partner() {
        System.out.println(" I love noone");
    }
}
