package CollectionsFramework.List;


import java.util.ArrayList;

class DataClass{   // this class is an Object class . it means every class in java is called object.
    private int ClassName;
    private char Section;
    private String ClassTeacherName;
    private int NumberOfStudent;

    private int NumberOfGirls;
    private int NumberOfBoys;

    public DataClass(int className, char section, String classTeacherName, int numberOfStudent, int numberOfGirls, int numberOfBoys) {
        ClassName = className;
        Section = section;
        ClassTeacherName = classTeacherName;
        NumberOfStudent = numberOfStudent;
        NumberOfGirls = numberOfGirls;
        NumberOfBoys = numberOfBoys;
    }

    public int getClassName() {
        return ClassName;
    }

    public void setClassName(int className) {
        ClassName = className;
    }

    public char getSection() {
        return Section;
    }

    public void setSection(char section) {
        Section = section;
    }

    public String getClassTeacherName() {
        return ClassTeacherName;
    }

    public void setClassTeacherName(String classTeacherName) {
        ClassTeacherName = classTeacherName;
    }

    public int getNumberOfStudent() {
        return NumberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        NumberOfStudent = numberOfStudent;
    }

    public int getNumberOfGirls() {
        return NumberOfGirls;
    }

    public void setNumberOfGirls(int numberOfGirls) {
        NumberOfGirls = numberOfGirls;
    }

    public int getNumberOfBoys() {
        return NumberOfBoys;
    }

    public void setNumberOfBoys(int numberOfBoys) {
        NumberOfBoys = numberOfBoys;
    }


    @Override
    public String toString() {
        return ClassName + ", " + Section + ", '" + ClassTeacherName + "', " + NumberOfStudent + ", " + NumberOfGirls + ", " + NumberOfBoys;
    }

}

public class TestCustomArrayList {

    public static void main(String[] args) {
        // creating ArrayList
        // here pass <DataClass> .because here we are pass object class like .Integer,String,Object ets more
        // DataClass also  Object.


  TestCustomArrayList customArrayList= new TestCustomArrayList();

        ArrayList<DataClass> dataClasses = new ArrayList<>();
        dataClasses.add(new DataClass
                (1,'A',"Mr.Kashyap",100,60,40));
        dataClasses.add(new DataClass
                (2,'A',"Riya",80,30,50));
        dataClasses.add(new DataClass
                (3,'A',"Ram Kumar",90,40,50));
        dataClasses.add(new DataClass
                (4,'A',"Mr.Kumar",50,20,30));
        dataClasses.add(new DataClass
                (5,'A',"Prince",110,30,80));
        dataClasses.add(new DataClass
                (6,'A',"Lovely",70,40,30));
        dataClasses.add(new DataClass
                (7,'A',"Neha",100,60,40));
        dataClasses.add(new DataClass
                (8,'A',"Rohan",130,60,70));

       Object [] a=dataClasses.toArray();

        for (Object data:a
             ) {
            System.out.println(data);
        }



        }


        }


