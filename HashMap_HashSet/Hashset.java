package HashMap_HashSet;
import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        //Creation
       HashSet<String>set=new HashSet<>();
       //insert
       set.add("shreya");
       set.add("anushka");
       set.add("nidhi");
       set.add("anchal");
        System.out.println(set);
        //search
        System.out.println(set.contains("nidhi"));
        //delete
        set.remove("shreya");
        System.out.println(set+" "+ set.size());
        //Iterators
        Iterator it=set.iterator();
        //
        // System.out.println(it.next());
//        it.remove();
//        System.out.println(set);
            while(it.hasNext()){
                System.out.println(it.next());
            }







    }
}
