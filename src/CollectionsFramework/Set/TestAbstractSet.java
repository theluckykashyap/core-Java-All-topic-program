package CollectionsFramework.Set;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.TreeSet;

public class TestAbstractSet {
    public static void main(String[] args) {
        // AbstractSet is a implement Set interface and extend Abstract class . it means abstract have
        // many property like set and Abstract class.

      //
        //  using
        AbstractSet<Integer> integers= new TreeSet<>();//tree Set is sorted order
        integers.add(234567);
        integers.add(4567);
        integers.add(567);
        integers.add(2);

        System.out.println(integers);
        System.out.println("------------------------------");

        AbstractSet<Integer> integers1= new HashSet<>();// not sorted order its is a random order.
        integers1.add(234567);
        integers1.add(4567);
        integers1.add(567);
        integers1.add(2);

        System.out.println(integers1);
    }
}
