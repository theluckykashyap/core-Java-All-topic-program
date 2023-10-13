package Interfaces.ComparatorInterface;

public class StudentPSS {
    private String studentName;
    private int studentRollNumber;
    private int studentClass;
    private char studentSection;

    public StudentPSS(String studentName, int studentRollNumber, int studentClass, char studentSection) {
        this.studentName = studentName;
        this.studentRollNumber = studentRollNumber;
        this.studentClass = studentClass;
        this.studentSection = studentSection;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    public char getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(char studentSection) {
        this.studentSection = studentSection;
    }

    @Override
    public String toString() {
        return "StudentPSS{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNumber=" + studentRollNumber +
                ", studentClass=" + studentClass +
                ", studentSection=" + studentSection +
                '}';
    }
}
