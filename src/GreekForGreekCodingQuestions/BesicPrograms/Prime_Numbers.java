package GreekForGreekCodingQuestions.BesicPrograms;

import java.util.Scanner;

public class Prime_Numbers {
    static  boolean Prime_Num(int num){
        if(num<=1){
         return false;
        }
        if(num %2==0){
            return false;
        }else return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number : ");
        int num=sc.nextInt();


        if(true){
            System.out.println("number is not prime : "+num);
        }else System.out.println("number is prime : "+num);
    }
}
