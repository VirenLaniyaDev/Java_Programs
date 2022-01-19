/** Daemon thread : Daemon thread is a service provider thread that provides services to the user thread.
 * --> Daemon thread is run in the background of another thread.
 * --> e.g. Garbage collector, finalizer, attach listener, Signal dispatch etc.
 * --> Its life depend on the mercy of user threads i.e. when all the user threads dies, JVM terminates this thread automatically.
 * --> It is a low priority thread.
 * --> The sole purpose of the daemon thread is that it provides services to user thread for background supporting task.
 * If there is no user thread, why should JVM keep running this thread. That is why JVM terminates the daemon thread if
 * there is no user thread.
 * --> Methods : public void setDaemon(boolean status), public boolean isDaemon()*/

package MultiThreading;

public class _3_1_DaemonThread_MT extends Thread{
    @Override
    public void run(){
        if(Thread.currentThread().isDaemon())   //
            System.out.println("This is Daemon thread.");
        else
            System.out.println("This is Child thread.");
    }

    public static void main(String []args){
        System.out.println("This is main thread.");
        _3_1_DaemonThread_MT T1=new _3_1_DaemonThread_MT();
        _3_1_DaemonThread_MT T2=new _3_1_DaemonThread_MT();
        _3_1_DaemonThread_MT T3=new _3_1_DaemonThread_MT();
        T1.setDaemon(true); //Now T1 is Daemon thread which is provide service
        T1.start();
        T2.start();
        T3.start();
    }
}
