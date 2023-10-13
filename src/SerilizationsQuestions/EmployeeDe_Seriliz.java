package SerilizationsQuestions;

import javax.imageio.stream.FileImageInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDe_Seriliz {
    public static void main(String[] args) {
        try{
            FileInputStream inputStream =new FileInputStream("text.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
            Employee employee = null;
            try {
                employee = (Employee) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            employee.display();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
