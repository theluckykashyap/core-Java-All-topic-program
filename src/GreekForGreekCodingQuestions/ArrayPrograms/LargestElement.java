package GreekForGreekCodingQuestions.ArrayPrograms;

import java.util.Arrays;
import java.util.Collections;

public class LargestElement {
    public static void main(String[] args) {
        // using shorting
       int  arr[] = {20, 10, 20, 4, 100};
      Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        //using Java 8 Stream
        int maxNum=Arrays.stream(arr).max().getAsInt();
        System.out.println("max Number : " +maxNum);

        //using Iterative Way
        int num = arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>num){
                num=arr[i];

            }

        }
        System.out.println("using for loop max element is : "+num);
    }
}
