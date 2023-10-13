package MultithreadingQuestions;

import static java.lang.Thread.*;

public class SynchorizationTest  {
    private boolean trun = true;
    synchronized public void makeT_Shirt() throws InterruptedException {
        while (!trun) {
            wait();
        }
        System.out.println("Making new t-shirt ");
        Thread.sleep(2000);
        trun = false;
        notify();
    }
  synchronized public void checkQuality() throws InterruptedException{
       while (trun){wait();}

       System.out.println("checked t-shirt");
      sleep(4000);
       trun=true;
       notify();
   }
    public static void main(String[] args) throws InterruptedException {
SynchorizationTest test= new SynchorizationTest();
        Thread maker_Thread = new Thread(() -> {
            try {
                while (true) {
                    test.makeT_Shirt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread checkThread = new Thread(() -> {
            try {
                while (true) {
                    test.checkQuality();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        maker_Thread.start();
        checkThread.start();

        maker_Thread.join();
        checkThread.join();
    }
}
