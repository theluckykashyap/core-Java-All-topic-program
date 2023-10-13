package Interfaces.ComparatorInterface;

import java.util.Comparator;

public class SortedByChar implements Comparator<StudentPSS> {
    @Override
    public int compare(StudentPSS s, StudentPSS s2) {
        return s.getStudentSection()-s2.getStudentSection();
    }
}
