package GreekForGreekCodingQuestions.BesicPrograms;

import java.util.Scanner;

public class Leap_Year {
    public static void Leap_year(int year){
        boolean leapYear=false;
        if(year%4==0) {
            leapYear=true;
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leapYear = true;
                else leapYear = false;

                }
            }else
                leapYear=false;
            if (leapYear) System.out.println("leap year : "+year);
            else System.out.println("not leap year : "+year);
        }
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter your Year : ");
      int year=  scanner.nextInt();
      Leap_year(year);
    }
}
