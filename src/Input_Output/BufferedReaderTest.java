package Input_Output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        String str=reader.readLine();
        int num = Integer.parseInt(reader.readLine());

        System.out.println("name is :"+str);
        System.out.println("number is :"+num);

    }
}
