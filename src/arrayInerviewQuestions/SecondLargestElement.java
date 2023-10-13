package arrayInerviewQuestions;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] number={123,453,76,875,35,876,335,34,467};

   /* int num = number[0];
        int num1=number[1];
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number.length;j++){
            if(num<number[i] && num1<number[j]){
            num1=number[i];
            num=number[j];
           if(num1<num)
           {

           }

            }

            }

        }
        System.out.println(num);
        System.out.println(num1);*/
 int size= number.length;;
        Arrays.sort(number);
        System.out.println(number[size-2]);
        }

        }


