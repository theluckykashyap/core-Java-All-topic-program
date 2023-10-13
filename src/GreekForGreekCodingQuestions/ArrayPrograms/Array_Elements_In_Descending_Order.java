package GreekForGreekCodingQuestions.ArrayPrograms;

import CollectionsFramework.Collection;

import java.util.Arrays;
import java.util.Collections;

public class Array_Elements_In_Descending_Order {
    public static void main(String[] args) {
        Integer array[] = {2, 6, 23, 98, 24, 35, 78};
        Arrays.sort(array, Collections.reverseOrder());

        for (Integer element : array) {
            System.out.print(element + " ");
        }
    }
}
