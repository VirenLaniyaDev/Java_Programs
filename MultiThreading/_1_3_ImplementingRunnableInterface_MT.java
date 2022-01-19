/** It is preferable that implement Runnable interface rather than extending Thread class.
 * Reasons:
 * 1) If a class extends a thread class then it can not extends any other class which may be required to extend.
 * 2) If a class thread is extended then all its functionalities get inherited. This is an expensive operation.*/

package MultiThreading;

class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is created!");
    }
}

public class _1_3_ImplementingRunnableInterface_MT {
    public static void main(String[] args) {
        MyThread obj=new MyThread();
        Thread t=new Thread(obj);   // First we need to create Object of thread class
        t.start();  // start() can't be invoked by Runnable interface
    }
}
