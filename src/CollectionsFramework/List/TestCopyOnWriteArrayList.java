package CollectionsFramework.List;

import java.util.concurrent.CopyOnWriteArrayList;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class TestCopyOnWriteArrayList {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> onWriteArrayList=new CopyOnWriteArrayList<>();
        System.out.println("before  Initial Iterator");

        Iterator x = onWriteArrayList.iterator();
        onWriteArrayList.add("kashyap");
        onWriteArrayList.add("lucky");
       while (x.hasNext()){
           System.out.println(x.next());
       }
        System.out.println("after  Initial Iterator");
       x=onWriteArrayList.iterator();
       while (x.hasNext()){
           System.out.println(x.next());
       }


    }
}
