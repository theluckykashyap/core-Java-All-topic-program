package CollectionsFramework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        // map contain  key and value pair . key always unique means can't be store duplicates element .but value
        // can store duplicates elements.
        // Map is an interface . can't be Create object of an interface .that is the reason we are create
        // class object .like hashmap,treemap etc.
//HashMap is an unOrdered .it means HashMap randomly printing the element .
        Map<Integer,String> map= new HashMap<>();
        map.put(102,"lucky");
        map.put(101,"Lucky1");
        map.put(1022,"lucky3");
        map.put(1021,"Lucky4");
        map.put(10332,"lucky5");
        map.put(1301,"Lucky6");
        map.put(1032,"lucky7");
        map.put(1013,"Lucky8");
        System.out.println(map);
// treeMap is a sorted map ;
        Map<Integer,Integer> map1= new TreeMap<>();
        map1.put(102,1);
        map1.put(101,1);
        System.out.println(map1);
// LinkedHashMap
        //it is provided principle property first in first out (fifo).

        Map<Integer,Integer> map2= new LinkedHashMap<>();

        map2.put(121,122);
        map2.put(111,354);
        map2.put(134,2344);
        map2.put(11,6534);

        System.out.println(map2);

    }
}
