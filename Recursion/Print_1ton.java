package Recursion;
public class Print_1ton {
    public static void main(String[] args) {
        fun(5);

    }
    static void fun(int n){
        if(n!=0){
            fun(n-1);
            System.out.println(n);

        }



    }
}
