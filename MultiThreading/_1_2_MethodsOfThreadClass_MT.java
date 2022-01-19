/** Static methods
 * 1)	static void	sleep()	-> It sleeps a thread for the specified amount of time.
 * 2)	static Thread currentThread()->	It returns a reference to the currently executing thread object.
 * 3)	static void	yield()-> It causes the currently executing thread object to pause and allow other threads to execute temporarily.
 * 4)	static boolean interrupted()-> It tests whether the current thread has been interrupted.
 * 5)	static int	activeCount()-> It returns the number of active threads in the current thread's thread group.
 * 6)	static boolean	holdLock(Object obj)-> It returns true if and only if the current thread holds the monitor lock on the specified object.
 * 7)	static void	dumpStack()-> It is used to print a stack trace of the current thread to the standard error stream.
 * 8)	static int	enumerate()-> It is used to copy every active thread's thread group and its subgroup into the specified array.
 * 9)	static Thread.UncaughtExceptionHandler	getDefaultUncaughtExceptionHandler()-> It returns the default handler invoked when a
 *    thread abruptly terminates due to an uncaught exception.
 * 10)	static void setDefaultUncaughtExceptionHandler()-> It sets the default handler invoked when a thread abruptly terminates due to
 *    an uncaught exception.*/

/** Methods
 * 1)	void start() -> It is used to start the execution of the thread.
 * 2)	void run() -> It is used to do an action for a thread.
 * 3)	void join() -> It waits for a thread to die.
 * 4)	int	getPriority() -> It returns the priority of the thread.
 * 5)	void setPriority() -> It changes the priority of the thread.
 * 6)	String	getName() -> It returns the name of the thread.
 * 7)	void setName() -> It changes the name of the thread.
 * 8)	long getId() -> It returns the id of the thread.
 * 9)	boolean	isAlive() -> It tests if the thread is alive.
 * 10)	boolean isDaemon() -> It tests if the thread is a daemon thread.
 * 11)	void setDaemon() -> It marks the thread as daemon or user thread.
 * 12)	void interrupt() -> It interrupts the thread.
 * 13)	boolean	isinterrupted() -> It tests whether the thread has been interrupted.
 * 14)	static boolean interrupted() -> It tests whether the current thread has been interrupted.
 * 15)	void checkAccess() -> It determines if the currently running thread has permission to modify the thread.
 * 16)	StackTraceElement[]	getStackTrace() -> It returns an array of stack trace elements representing the stack dump of the thread.
 * 17)	Thread.State getState() -> It is used to return the state of the thread.
 * 18)	ThreadGroup	getThreadGroup() -> It is used to return the thread group to which this thread belongs
 * 19)	String toString() -> It is used to return a string representation of this thread, including the thread's name, priority, and thread group.
 * 20)	void notify() -> It is used to give the notification for only one thread which is waiting for a particular object.
 * 21)	void notifyAll() -> It is used to give the notification to all waiting threads of a particular object.
 * 22)	void setContextClassLoader() -> It sets the context ClassLoader for the Thread.
 * 23)	ClassLoader	getContextClassLoader() -> It returns the context ClassLoader for the thread.*/

package MultiThreading;

public class _1_2_MethodsOfThreadClass_MT extends Thread{

    @Override
    public void run(){
        System.out.println("This is Thread demo.");
        //////////////// Static methods ////////////////
        try{
        sleep(3000);   //1000 millis = 1 sec, So after 3 secs next statement will execute
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Current thread is : "+currentThread());
        System.out.println("This thread interrupted is : "+interrupted());
        System.out.println("Active thread in the current thread's thread group : "+activeCount());
        System.out.println("The current thread holds the monitor lock on the specified object is : "+holdsLock(new _1_2_MethodsOfThreadClass_MT()));
        dumpStack();
        getDefaultUncaughtExceptionHandler();
    }

    public static void main(String[] args) {
        _1_2_MethodsOfThreadClass_MT obj=new _1_2_MethodsOfThreadClass_MT();
        obj.start();
        obj.setPriority(1);     //Set Priority of thread
        System.out.println("Priority of the thread : "+obj.getPriority());
        obj.setName("My thread");   //Set Name of thread
        System.out.println("Name of the thread : "+obj.getName());
        System.out.println("ID of the thread : "+obj.getId());
        System.out.println("Thread alive is : "+obj.isAlive());
        obj.interrupt();    //Interrupt in thread
        System.out.println("Thread interrupted is : "+obj.isInterrupted());
        obj.checkAccess();
        System.out.println("Stack dump of the thread : "+obj.getStackTrace());
        System.out.println("State of thread is : "+obj.getState());
        System.out.println("Thread group of thread is : "+obj.getThreadGroup());
        System.out.println("Thread is Daemon :"+obj.isDaemon());
        System.out.println("String representation of thread : "+obj.toString());
        obj.notify();
        obj.notifyAll();
    }
}
