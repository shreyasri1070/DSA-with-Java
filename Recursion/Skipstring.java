package Recursion;

public class Skipstring {
    public static void main(String[] args) {
       // System.out.println(skip("bacapplefg","apple"));
        System.out.println(skipbutwithcondition("bacapplefd","app"));
    }
    static String skip(String up,String s){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return skip(up.substring(5),s);
        }
        else{
           return ch+ skip(up.substring(1),s);
        }
    }
//Question -3
    //skip the string if it's not the required string ex-skip app but not only when if it's not apple
    static String skipbutwithcondition(String up,String s){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("app")&& !up.startsWith("apple")){
            return skipbutwithcondition(up.substring(3),s);
        }
        else{
            return ch+ skipbutwithcondition(up.substring(1),s);
        }
    }
}
