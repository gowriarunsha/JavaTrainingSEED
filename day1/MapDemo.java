package day1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> capitals=new HashMap<>();
        //adding elements
        capitals.put("India", "Delhi");

        for(String key: capitals.keySet()){
            System.out.println(key+":"+capitals.get(key));


        //for hashmap of classes
        }
    }
}
