package MultithreadingQuestions;

public class TestByUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Using Runnable interface Thread with Id "+Thread.currentThread().threadId());
        System.out.println("Using Runnable interface Thread with Name "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        int num =5;
        for (int i=1;i<=5;i++){
            Thread thread = new Thread(new TestByUsingRunnable());
            thread.start();
        }
    }
}
