/** Multithreading : Multithreading in Java is a process of executing multiple threads simultaneously.
 * --> What is thread? : A thread is a lightweight sub-process, the smallest unit of processing.
 * --> Way to achieve Multitasking : 1) MultiProcessing     2) Multithreading
 * --> Threads are independent. If there occurs exception in one thread, it doesn't affect other threads.
 * --> Threads use a shared memory area. They don't allocate separate memory area so saves memory, and context-switching
 *     between the threads takes less time than process. So Multithreading is better than Multiprocessing.
 * --> Java provides Thread class to achieve thread programming.
 * --> Declaration : public class Thread extends Object implements Runnable
 * --> Runnable contains only 'void run()'.
 */

/* Thread Life cycle
* State 1 : New state or Create state
* State 2 : Runnable state -> JVM allocate processor to execute thread
* State 3 : Running state
* State 4 : Non runnable state
*   1) Waiting -> If another thread starts executing
*   2) Timed waiting state -> Waiting for some interval
*   3) Blocked -> For I/0 request
*   -> When Non runnable period is over it again goes to Runnable state.
* State 5 : Termination state -> After successful completion execution, the thread enters to termination state.*/

package MultiThreading;

import java.lang.Thread;    //Thread class can be used to create a thread
/* Constructor :
* -> Thread()
* -> Thread(String s)
* -> Thread(Runnable obj)
* -> Thread(Runnable obj,String s)*/

// 1. Inherit Thread class for create thread
public class _1_1_IntroductionToMultithreading_MT extends Thread{

    @Override   //2.Override void run() and write your thread content
    public void run(){  //This method is very important; It is used to do an action for a thread and thread's behaviour can be implemented.
        System.out.println("Thread executed successfully!");
    }

    // main method is also thread which is initialized by JVM.
    public static void main(String[] args) {
        _1_1_IntroductionToMultithreading_MT obj=new _1_1_IntroductionToMultithreading_MT();    //3.Create object of class which extends Thread class
        obj.start();    //4.Start thread execution; Here notice for execute thread we must call start().
    }
}
