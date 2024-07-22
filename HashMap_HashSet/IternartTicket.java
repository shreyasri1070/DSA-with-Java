package HashMap_HashSet;

import java.util.HashMap;
//Question description
public class IternartTicket {
    public static String getStart(HashMap<String,String>tick){

            for(String key: tick.keySet()){
                if(!tick.containsValue(key)){
                    return key;
                }
            }
            return null;
    }



    public static void main(String[] args) {
        HashMap<String,String>tickets=new HashMap<>();
        tickets.put("Chennai","Bengaluru");

        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","Chennai");
        tickets.put("Delhi","Goa");

        String start =getStart(tickets);
        while(tickets.containsKey(start)){
            System.out.print(start+"-->");
            start=tickets.get(start);
        }
        System.out.println(start);


            }
}
