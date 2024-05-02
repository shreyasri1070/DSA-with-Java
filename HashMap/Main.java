package HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;



class MapUsingHash{
    private Entity[]entities;

    public MapUsingHash() {
        entities=new Entity[100];

    }
    public void put(String key,String value){
        int hash=Math.abs(key.hashCode()%entities.length);
        entities[hash]=new Entity(key, value);
    }

    public void remove(String key,String value){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
         entities[hash]=null;
        }
    }
    public String get(String key){
        int hash=Math.abs(key.hashCode()%entities.length);
        if(entities[hash]!=null&&entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;

    }
    private class Entity{
        String key;
        String  value;
        public Entity(String key ,String value){
            this.key=key;
            this.value=value;
        }
    }
}

public class Main{
    public static void main(String[] args) {

        MapUsingHash map3=new MapUsingHash();
        map3.put("Mango","King of fruit");
        System.out.println(map3.get("Mango"));

        HashMap <String,Integer>map=new HashMap<>();
        map.put("kunal",89);
        map.put("Karan",99);
        map.put("Rahul",94);
        System.out.println(map.get("Karan"));
        System.out.println(map.getOrDefault("Apporav",78));
        System.out.println(map.containsKey("kunal"));
        HashSet<Integer>  set=new HashSet<>(); // it contains no duplicates
        set.add(56);
        set.add(19);
        set.add(21);
        set.add(45);
        set.add(19);
        System.out.println(set);

            TreeMap <String,Integer>map1=new TreeMap<>();
        map.put("kunal",89);
        map.put("Karan",99);
        map.put("Rahul",94);

    }
}
