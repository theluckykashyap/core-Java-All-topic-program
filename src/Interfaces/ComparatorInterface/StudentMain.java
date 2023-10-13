package Interfaces.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;

public class StudentMain  {
    public static void main(String[] args) throws ConcurrentModificationException {

        ArrayList<StudentPSS> pss= new ArrayList<StudentPSS>();

        pss.add(new StudentPSS("Lucky",101,12,'A'));
        pss.add(new StudentPSS("Rohan",102,12,'B'));
        pss.add(new StudentPSS("Neha",103,11,'A'));
        pss.add(new StudentPSS("Prince",105,10,'A'));
        pss.add(new StudentPSS("Rohan",112,10,'B'));
        pss.add(new StudentPSS("Ram",110,11,'B'));

        System.out.println("sorted by RollNumber");
       Collections.sort(pss,new SortByRollNo());
            for (StudentPSS num:pss
             ) {
                System.out.println("it is sorted by RollNumber : " + num);
            }
            System.out.println("sorted by Name ");
            Collections.sort(pss,new SortedByName());
            for (StudentPSS num2:pss
                 ) {
                System.out.println(num2);
            }

            System.out.println("sorted by char(sections) ");

            Collections.sort(pss,new SortedByChar());
            for (StudentPSS num3:pss
            ) {
                System.out.println(num3);
            }
        }

    }

