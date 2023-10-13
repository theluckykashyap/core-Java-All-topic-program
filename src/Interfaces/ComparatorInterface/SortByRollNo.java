package Interfaces.ComparatorInterface;

import java.util.Comparator;

public class SortByRollNo implements Comparator<StudentPSS> {



    @Override
    public int compare(StudentPSS s, StudentPSS s2) {

        return s.getStudentRollNumber()-s2.getStudentRollNumber();
    }
}
