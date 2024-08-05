package StackandQueue;

import java.util.*;

public class InbuiltEx {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(45);
        stack.push(46);
        System.out.println(stack.pop());

        Queue <Integer> queue=new LinkedList<>();
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek());
        System.out.println(queue.remove());

        //Deck(Deque)
        Deque<Integer> deque=new ArrayDeque<>(); //resizable queue
        deque.add(44);
        deque.add(55);
        deque.removeFirst();
        deque.removeLast();



    }
}
