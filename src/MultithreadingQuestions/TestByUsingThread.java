package MultithreadingQuestions;

public class TestByUsingThread extends Thread {
    public void display() {
        try {
            start();
            System.out.println("display Name " + Thread.currentThread().getName());
            System.out.println("display Id " + Thread.currentThread().getId());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {


        int num = 5;
        for (int i = 1; i <=num; i++) {
            TestByUsingThread test = new TestByUsingThread();
            test.display();
        }


    }
}