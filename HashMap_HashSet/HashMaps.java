package HashMap_HashSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {

        HashMap <String,Integer> map=new HashMap<>();
        map.put("Shreya",1);
        map.put("priya",2);
        map.put("anchal",3);
        System.out.println(map);

        //update
        map.put("anchal",4);

        //search
        map.get("priya");//--give valur
        map.get("ght");//--give null
        map.containsKey("Shreya");
        //Iteration
        for (Map.Entry<String,Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        //another way
        Set<String>keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //remove
        System.out.println( map.remove("priya"));




    }
}
