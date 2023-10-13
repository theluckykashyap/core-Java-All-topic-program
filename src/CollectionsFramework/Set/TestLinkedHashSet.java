package CollectionsFramework.Set;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        // LinkedHashSet implement Set interface and extend doubly-linked List . it is provided both side access and
        // retive data.
        LinkedHashSet<String> hashSet= new LinkedHashSet<>();
        hashSet.add("S");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("R");
        hashSet.add("C");
        System.out.println(hashSet);
        // it  is provided same access order like first in first out (FIFO).

    }
}
