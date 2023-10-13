package MultithreadingQuestions;

import java.io.IOException;
import java.nio.CharBuffer;

public class ThreadTest extends Thread{


    int num=10;
    void getNumber()throws InterruptedException{
        for (int k =1; k<num;k++){
            sleep(2000);
            System.out.println(k);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        System.out.println(threadTest.getName());

        threadTest.getNumber();
        sleep(3000);
        System.out.println("end program");

    }

}
