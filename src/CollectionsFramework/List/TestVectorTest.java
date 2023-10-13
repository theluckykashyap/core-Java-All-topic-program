package CollectionsFramework.List;

import java.util.Vector;

public class TestVectorTest {
    /*If the increment is specified, Vector will expand according to it in each allocation cycle. Still,
    if the increment is not specified, then the vector’s capacity gets doubled in each allocation cycle.
    Vector defines three protected data members:

int capacityIncreament: Contains the increment value.
int elementCount: Number of elements currently in vector stored in it.
Object elementData[]: Array that holds the vector is stored in it.*/
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(90);
        vector.add(76);
        vector.add(34);
        vector.add(1323);

        System.out.println(vector);
        // remove element form vectorList .using index
        vector.remove(1);
        System.out.println(vector);
        // using element value
        vector.removeElement(34);
        System.out.println(vector);
        //update element using by index
        vector.add(0, 100);
        System.out.println(vector);

        //iterating element

        for (int num : vector
        ) {
            System.out.println("iterating element : " + num);
        }


    }
}
