package CollectionsFramework.Set;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(0);
        hashSet.add(122);
        hashSet.add(1212);
        hashSet.add(120);
        hashSet.add(121);
        hashSet.add(12123);

        System.out.println(hashSet);
        // hashset provided random access of element .
        // hashset implement set interface and extend hashtable ;
        // duplicate element is not allow . only null value allow only one time .
       //  hashSet have property hashtable and set interface means all method working in hashSet.



    }
}
