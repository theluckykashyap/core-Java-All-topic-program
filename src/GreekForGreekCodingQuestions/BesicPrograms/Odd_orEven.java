package GreekForGreekCodingQuestions.BesicPrograms;

import EncapsulationsExample.Main;

import java.util.Scanner;

public class Odd_orEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your integer number : ");
       int num= sc.nextInt();
       if(num==0 ){
           System.out.println("Please enter positive number");
       }
      if(num%2 == 0){
          System.out.println(num+ " is even number .");

        }else {
          System.out.println(num+ " is odd number .");
      }
    }
}
