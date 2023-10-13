package arrayInerviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] number1={45,56,45,76,87,34,23,56,76,54,67,87};
        //using nested loop
        for (int i=0;i< number1.length;i++){
            for (int k=i+1;k< number1.length;k++){
               if (number1[i]==number1[k]){
                   System.out.println("Duplicate element : "+number1[k]);
               }
            }

        }
        // using set
        Set<Integer> integers=new HashSet<>();
        System.out.println("find duplicate element using set ");
        for (int number:number1
             ) {
            if (!integers.add(number)){

                System.out.println("Duplicate element : "+number);
            }
        }

    }

}
