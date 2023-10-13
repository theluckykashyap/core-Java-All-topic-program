package CollectionsFramework.Set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {

        // treeSet is a provided natural order of an element.means ascending order

        // using treeSet

        TreeSet<String> strings = new TreeSet<>();
        strings.add("T");
        strings.add("W");
        strings.add("A");

        System.out.println(strings);

        // using NavigableSet
        System.out.println("-----------------------------------------");
        NavigableSet<String> navigableSet= new TreeSet<>();
        navigableSet.add("C");
        navigableSet.add("D");
        navigableSet.add("A");
        navigableSet.add("Z");
        System.out.println(navigableSet);

    }
}
