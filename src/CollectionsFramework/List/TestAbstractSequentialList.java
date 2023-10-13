package CollectionsFramework.List;

import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class TestAbstractSequentialList {
    public static void main(String[] args) {

//It is used to implement an unmodifiable list,
// for which one needs to only extend this AbstractList Class and implement only the get() and the size() methods.
        AbstractSequentialList<Integer> list = new LinkedList<>();
        list.add(234);
        list.add(435);
        list.add(5678);
        list.add(244);

        System.out.println(list);

    }
}