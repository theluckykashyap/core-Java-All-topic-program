package CollectionsFramework.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
    // SortedMap means it is provided sorted element .
    public static void main(String[] args) {
        SortedMap<Integer,Integer> sortedMap = new TreeMap<>();
         sortedMap.put(23,43);
        sortedMap.put(233,432);
        sortedMap.put(237,433);
        sortedMap.put(2323,4325);
        sortedMap.put(23222,4324);
        sortedMap.put(2321,4324);
        sortedMap.put(231,42453);

        System.out.println(sortedMap);

    }
}
