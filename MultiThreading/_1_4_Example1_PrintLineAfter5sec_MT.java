/**
 * Write a Java program that prints the numbers from 1 to 10 line by line after every 5 sec.
 */

package MultiThreading;

class Print1to10 implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
            try {
                Thread.sleep(5000); // 1000 millisec = 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class _1_4_Example1_PrintLineAfter5sec_MT {
    public static void main(String[] args) {
        Print1to10 obj=new Print1to10();
        Thread th=new Thread(obj);
        th.start();
    }
}
