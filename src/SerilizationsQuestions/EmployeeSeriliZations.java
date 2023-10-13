package SerilizationsQuestions;

import java.io.*;

public class EmployeeSeriliZations {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee("Lucky", 12, 120000.00, "Seriliations Project");

            FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
            ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            fileOutputStream.close();
            objectOutputStream.close();

            System.out.println("Object Covert into a file ");

        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
