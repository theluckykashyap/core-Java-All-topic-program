package Input_Output;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerClassTest {
    // it is an advanced version of BufferedReader.
    public static void main(String[] args) {
        Scanner scanner
                = new Scanner(System.in);
        System.out.println("enter your name :");
        String str= scanner.nextLine();
        System.out.println("enter your number :");
        int num= Integer.parseInt(scanner.nextLine());

        System.out.println("name is : "+str);
        System.out.println("number is : "+num);

    }
}
