/**
 * Write an application that creates and starts three threads. Each thread is initiated from the same class. It executes
 * a loop with 10 iterations. Each iteration displays string "HELLO", sleep for 300 milliseconds. The application waits
 * for all the threads to complete and displays the message "Good Bye...".
 */


package MultiThreading;

class MultiThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("HELLO");
                sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
        }
    }
}

public class _2_4_Example3_PrintHELLO_MT {
    public static void main(String[] args) {
        MultiThread mt1=new MultiThread();
        MultiThread mt2=new MultiThread();
        MultiThread mt3=new MultiThread();
        mt1.start();
        mt2.start();
        mt3.start();
        try{
            mt1.join();
            mt2.join();
            mt3.join();
        }catch (InterruptedException e){}
        System.out.println("Good Bye...");
    }
}
