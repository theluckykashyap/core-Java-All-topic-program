package GreekForGreekCodingQuestions.ArrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int array[]= {12,32,4,54,6,75,7,87,3,1,1,3,3,87,75};
        Set<Integer> set= new HashSet<>();
        for (int num:array
             ) {
            set.add(num);
        }
        Integer removeDuplicateArray[]= set.toArray(new Integer[set.size()]);
        for (Integer el:removeDuplicateArray
             ) {
            System.out.print(el+" ");
        }
    }
}
