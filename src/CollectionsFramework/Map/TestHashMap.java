package CollectionsFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        //creating hashMap
        HashMap<Integer,String > hashMap= new HashMap<>();
        // using added method
        hashMap.put(11,"Kashyap");
        hashMap.put(12,"Prince");
        hashMap.put(15,"Lovely");
        hashMap.put(98,"neha ");

        System.out.println(hashMap);

        //Traversal of HashMap
        for (Map.Entry<Integer,String> map: hashMap.entrySet()
             ) {
            System.out.println("key of Hashmap : "+map.getKey()+"   value of hashmap : "+map.getValue());
        }
       
        
    }
}
