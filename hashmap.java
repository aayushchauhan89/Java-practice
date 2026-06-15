import java.util.HashMap;
public class hashmap{
    public static void main(String [] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aayu",3);
        map.put("Sagu",5);
        map.put("Sanu",2);
        map.put("Sagu",1);
        System.out.println(map);
        System.out.println(map.size());
        map.remove("Sagu");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("Aayu"));
        System.out.println(map.containsKey("Sagu"));
        for(String key : map.keySet()){
            System.out.println(key +" " + map.get(key));
        }
    }
}