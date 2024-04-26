package Recursion;

public class PrintNto1 {

        public static void main(String[] args) {
            funboth(5);

        }
        static void fun(int n){
            if(n!=0){

                System.out.println(n);
                fun(n-1);
            }



        }
    static void funboth(int n){
        if(n!=0) {

            System.out.println(n);
            funboth(n - 1);
            System.out.println(n);
        }
    }
    }

