package String;

import java.awt.font.FontRenderContext;
import java.util.Arrays;

public class string_Lsearch {
    public static void main(String[] args) {
        String sc="shreya";
        char target='y';

        int result=Search(sc,target);
        System.out.println(result);
        // convert to charcter array
      System.out.println(Arrays.toString(sc.toCharArray()));


    }
    static int Search(String sc,char target){
        if(sc.length()==0){
            return 0;
        }
        //ENHANCED FOR LOOP
//        for (char element:sc.toCharArray()
//             ) {
//            if(target==element){
//                return true;
//            }
//
//        }
        for(int i=0;i<sc.length();i++){
            if(target==sc.charAt(i)){
                return i+1;
            }
        }
        return -1;
    }
}
