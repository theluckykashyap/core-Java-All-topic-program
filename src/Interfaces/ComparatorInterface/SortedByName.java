package Interfaces.ComparatorInterface;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedByName implements Comparator<StudentPSS> {


  @Override
  public int compare(StudentPSS s, StudentPSS s1) {

    return s.getStudentName().compareTo(s1.getStudentName());
  }
}
