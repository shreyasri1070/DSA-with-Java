package oops.interfaces.NESTED;

public class A {
    //NESTED INTERFACE
    public interface  NestedInterface{
        boolean isodd(int num);
    }
}
class B implements A.NestedInterface{
    @Override
    public boolean isodd(int num) {
        return (num&1)==1;
    }
}