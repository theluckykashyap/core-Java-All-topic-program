package CollectionsFramework.List;

import java.util.AbstractList;
import java.util.ArrayList;

public class TestAbstractList {
    public static void main(String[] args) {
        AbstractList <Integer> abstractList = new ArrayList<>();
        abstractList.add(23);
        abstractList.add(212);
        abstractList.add(34);
        abstractList.add(111);

        System.out.println(abstractList);

        // hashcode() method  return hashcode  value
        System.out.println("hashCode of abstractList : "+ abstractList.hashCode());
    }
}
