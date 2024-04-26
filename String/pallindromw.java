package String;

import java.util.Scanner;
public class pallindromw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s=s.toLowerCase();
        System.out.println(check(s));
    }

    static boolean check(String s) {

        for (int i = 0; i < s.length()/2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if (start !=end) {
                return false;
            }
        }
        return true;

    }
}
