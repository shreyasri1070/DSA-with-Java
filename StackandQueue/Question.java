package StackandQueue;
import java.util.Arrays;
import java.util.Stack;

public class Question {
// Implement Queue from Stack
    class MyQueue {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public MyQueue() {
            this.stack1=new Stack<>();
            this.stack2=new Stack<>();
        }

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            while(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public int peek() {
            while(stack2.isEmpty()){
                while(!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public boolean empty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }

    // Game of Stack
    class GameStack{
        public static int GameStack(int x,int[]a,int[]b){
            return twoStacks(x,a,b,0,0)-1;
        }

        private static int twoStacks(int x,int[]a,int []b,int sum,int count){
            if(sum>x){
                return count;
            }

            if(a.length==0||b.length==0){
                return count;
            }
            int ans1=twoStacks(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
            int ans2=twoStacks(x,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);
            return Math.max(ans1,ans2);
        }
    }


    //Largest Rectangle in Histrogram

}
