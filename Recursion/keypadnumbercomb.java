package Recursion;

public class keypadnumbercomb {
    public static void main(String[] args) {
        number("","12");
    }
    public static void number(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit =  up.charAt(0)-'0';
        for(int i=(digit-1)*3 ;i<digit*3;i++){
            char ch=(char)('a'+i);
            number(p+ch,up.substring(1));
        }

    }
}
