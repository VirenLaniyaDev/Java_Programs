/**--> Each thread have priority.
 * --> Priorities are represented by a number between 1 and 10.
 * -->  In most cases, thread schedular schedules the threads according to their priority (known as preemptive scheduling).
 * But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.
 * --> 3 constants defined in Thread class:
 * 1. public static int MIN_PRIORITY    - Minimum Priority  - value is 1
 * 2. public static int NORM_PRIORITY   - Normal Priority   - value is 5    -This priority is default priority
 * 3. public static int MAX_PRIORITY    - Maximum Priority  - value is 10
 * --> Only for 1,5 and 10 the constants are defined, for others we can define as integer values.
 * --> Methods : public final int getPriority()
 *               public final void setPriority()
 * --> Windows does not support Priorities.*/

package MultiThreading;

public class _4_1_ThreadPriorities_MT extends Thread{

    public void run(){
        System.out.println("Thread name is :"+currentThread().getName()+" | Thread Priority is :"+currentThread().getPriority());
    }

    public static void main(String[] args) {
        _4_1_ThreadPriorities_MT tobj1=new _4_1_ThreadPriorities_MT();
        _4_1_ThreadPriorities_MT tobj2=new _4_1_ThreadPriorities_MT();
        _4_1_ThreadPriorities_MT tobj3=new _4_1_ThreadPriorities_MT();
        _4_1_ThreadPriorities_MT tobj4=new _4_1_ThreadPriorities_MT();
        _4_1_ThreadPriorities_MT tobj5=new _4_1_ThreadPriorities_MT();

        tobj1.start();  //Priority 5
        tobj2.setPriority(NORM_PRIORITY);   //Priority 5
        tobj2.start();
        tobj3.setPriority(MIN_PRIORITY);    //Priority 1
        tobj3.start();
        tobj4.setPriority(MAX_PRIORITY);    //Priority 10
        tobj4.start();
        tobj5.setPriority(7);   //Priority 7
        tobj5.start();

    }
}
