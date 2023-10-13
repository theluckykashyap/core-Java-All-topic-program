package CollectionsFramework.Set;

import java.util.concurrent.CopyOnWriteArraySet;

public class TestCopyOnWriteArraySet {
    public static void main(String[] args) {
        CopyOnWriteArraySet<Integer>set = new CopyOnWriteArraySet<>();
         set.add(12);
        set.add(15);
        set.add(10);
        set.add(19);
        System.out.println("normal output : "+set);
        // using for each loop
        for (int set1:set
             ) {
            System.out.println(set1);
        }
        set.add(50);

        System.out.println(set);
        for (int set1:set
        ) {
            System.out.println(set1);
        }
    }
}
