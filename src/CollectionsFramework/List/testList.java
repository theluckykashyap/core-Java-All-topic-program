package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class testList {
    // it is example of ArrayList
    // ArrayList implement List interface and extend Collections
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(1105);
        list.add(34);
        list.add(5);
        list.add(70);
        list.add(80);

        System.out.println(list);

        // sorting an array
        Collections.sort(list);
        System.out.println("sorted Array using collection ");
        System.out.println(list);
        //size of Array
        System.out.println("Size of Array");
        System.out.println(list.size());
       //Using contains in ArrayList
        // contains method  return boolean value means true or false;
        boolean flag=list.contains(80);
        if (flag ){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
       // using isEmpty in ArrayList
        // isEmpty function return  true value and false value
        if (list.isEmpty()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        // using iterator we are printing all elements
        // using ListIterator
        ListIterator<Integer> list1= list.listIterator();
             while (list1.hasNext()){
                 System.out.println("using iterator : "+list1.next());
             }

             


    }
}
