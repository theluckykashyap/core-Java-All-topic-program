package arrayInerviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int [] arr1 = {0,32,56,567,4567,81,0,17,18,56};
        //using set
        Set<Integer> integers=new HashSet<>();
        for (int num:arr1
             ) {
            integers.add(num);
        }
        Integer [] arr2 = integers.toArray(new Integer[integers.size()]);
        for (Integer num:arr2
             ) {
            System.out.println(num);
        }

    }
}
