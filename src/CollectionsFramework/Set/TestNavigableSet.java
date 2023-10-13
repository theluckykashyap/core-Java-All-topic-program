package CollectionsFramework.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(23);
        set.add(28);
        set.add(24);
        set.add(27);
        set.add(26);
        set.add(29);
        set.add(21);
        NavigableSet<Integer> set1= set.descendingSet();
        System.out.println("normal order : "+set);
        System.out.println("-------------------------------");
        System.out.println("descending order : "+set1);
    }
}
