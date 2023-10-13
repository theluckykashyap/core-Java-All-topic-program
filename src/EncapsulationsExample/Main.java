package EncapsulationsExample;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(12);
        student.setStudentClass(12);
        student.setStudentName("lucky");
        System.out.println(student.getStudentClass());
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());




    }
}
