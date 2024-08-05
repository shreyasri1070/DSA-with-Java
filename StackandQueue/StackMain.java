package StackandQueue;

public class StackMain {
    public static void main(String[] args)throws StackException {
      //  CustomStack stack=new CustomStack(5);
        DynamicStack stack=new DynamicStack(5);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(8);

//        System.out.println(stack.pop());

    }
}
