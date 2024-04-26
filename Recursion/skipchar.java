package Recursion;

public class skipchar {
    public static void main(String[] args) {
   // str("","baccad");
      //  System.out.println(str_rt("","baccad"));
       // System.out.println(skip("baccad"));
        String s="bacccad";
        System.out.println(s.replace("a",""));
    }
    static void str(String p,String up){ //p is processed and up is unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
         str(p ,up.substring(1));
    }
        else{
            str(p+ch ,up.substring(1));
        }
    }
    // If there is return type
    static String str_rt(String p,String up){ //p is processed and up is unprocessed
        if(up.isEmpty()){
            return p;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
           return str_rt(p ,up.substring(1));
        }
        else{
           return str_rt(p+ch ,up.substring(1));
        }

    }

    // Approach -2 if only one argument is pass

    static String skip(String up){ //p is processed and up is unprocessed
        if(up.isEmpty()){

            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
           return skip(up.substring(1));
        }
        else{
            return ch+ skip(up.substring(1));
        }
    }
}
