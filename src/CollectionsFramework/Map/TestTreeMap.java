package CollectionsFramework.Map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
    //TreeMap Provided natural ordering of keys.
    //
    public static void main(String[] args) {
        TreeMap<Integer,String>treeMap = new TreeMap<>();

        treeMap.put(1,"asdffghg");
        treeMap.put(19,"fghgsdf");
        treeMap.put(13,"fghdfg");
        treeMap.put(21,"fweghg");

        System.out.println(treeMap);

    }
}
