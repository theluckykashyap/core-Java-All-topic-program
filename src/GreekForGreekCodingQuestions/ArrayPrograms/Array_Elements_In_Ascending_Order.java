package GreekForGreekCodingQuestions.ArrayPrograms;

import java.util.Arrays;

public class Array_Elements_In_Ascending_Order {
    public static void main(String[] args) {
        int array[]= {12,32,4,54,6,75,7,87,3,1};
        Arrays.sort(array);
        for (int num:array
             ) {
            System.out.print(" "+num);
        }
    }
}
