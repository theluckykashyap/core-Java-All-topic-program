package CollectionsFramework.Map;

import java.util.HashMap;

public class TestWeakHashMap {
    public static void main(String[] args) {
        HashMap<String,String> weakHashMap = new HashMap<>();

        weakHashMap.put("1","cat");
        weakHashMap.put("2","Dog");
        weakHashMap.put("3","Dog2");

        System.out.println("its is a weakhashmap : "+weakHashMap);
        if (weakHashMap.containsKey("2")){
            System.out.println("null");
        }

        weakHashMap.clear();

        if (weakHashMap.isEmpty()){
            System.out.println("empty map ");
        }

    }
}
