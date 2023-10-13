package CollectionsFramework.List;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

// A linear data structure used to store the elements in contiguous locations is called a Linked List.
// where each node store the data and the address of the next node.
//  linked List have many methods like add(), remove(), add(index,element) ets.
public class TestLinkedList {
    public static void main(String[] args) {
        //creating  LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        //here we are using  add method
        linkedList.add(2345);
        linkedList.add(45678);
        linkedList.add(234);
        linkedList.add(21);
        // here LinkedList is  ordered element . it means first in first out ;
        System.out.println(linkedList);



        //This method Inserts the specified element at the specified position in this list.
        linkedList.add(1,50);
        System.out.println(linkedList);

        //This method Inserts the specified element at the beginning of this list.
        linkedList.addFirst(100);
        System.out.println("list first element added 100 : "+linkedList);

        //This method Inserts the specified element at the last of this list.
        linkedList.addLast(200);
        System.out.println("last element added 200 : "+linkedList);

        //This method returns a shallow copy of this LinkedList.

        // here we are clone data linkedList to linkedList1;
         LinkedList<Integer> linkedList1= new LinkedList<>();
         linkedList1=(LinkedList<Integer>) linkedList.clone();

        System.out.println("it is a linkedList1 . added data using clone method : "+linkedList1);

        //This method returns true if this list contains the specified element.
        System.out.println(linkedList.contains(200));

        //This method returns an iterator over the elements in this deque in reverse sequential order.
        Iterator y= linkedList.descendingIterator();

        while (y.hasNext()){
            System.out.println("reverse order : "+y.next());
        }

        // if we went first element of the list then we are using element() or getfirst() method.
        System.out.println(linkedList.element());

        // poll() method we are using for if we went remove first element of the list .

        System.out.println(linkedList.poll());

     //This method replaces the element at the specified position in this list with the specified element.
        linkedList.set(4,500);
        System.out.println(linkedList);

    //This method returns an array containing all of
   // the elements in this list in proper sequence (from first to last element).
        Object [] x =linkedList.toArray();
        for (Object num:x
             ) {
            System.out.print(num);
            System.out.print(" ");
        }


    }
}
