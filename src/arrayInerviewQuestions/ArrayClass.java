package arrayInerviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 45, 6, 8,453,0,7,4,};
        // 1st method to sort an Array
        Arrays.sort(arr);
        System.out.println(" sorted  Array : " + Arrays.toString(arr));
        List<Integer> ll=new ArrayList<>();
        for (int j = 0; j < arr.length-1; j++) {
          if (arr[j] > arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              ll.add(temp);
              arr[j+1]=temp;
          }else ll.add(arr[j+1] );

            }
        for (int num:ll
             ) {
            System.out.println(num);
        }
        }

    }

