package MultiThreading;

///////////// By Extending Thread Class /////////////
class A1 extends Thread{
    public void run(){
        try{
        System.out.println("A1 : Thread is created by extending Thread class.");
        sleep(1000);    //1000 millis = 1 sec
        }
        catch (InterruptedException e){
            System.out.println("Exception in thread handling!");
        }
    }
}

class B1 extends Thread{
    public void run(){
        try{
        System.out.println("B1 : Thread is created by extending Thread class.");
        sleep(1000);    //1000 millis = 1 sec
        }
        catch (InterruptedException e){
            System.out.println("Exception in thread handling!");
        }
    }
}

///////////// By Implementing Runnable interface /////////////
class A2 implements Runnable{
    public void run(){
        try{
            System.out.println("A2 : Thread is created by implementing Runnable interface.");
            Thread.sleep(1000);    //1000 millis = 1 sec
        }
        catch (InterruptedException e){
            System.out.println("Exception in thread handling!");
        }
    }
}

class B2 implements Runnable{
    public void run(){
        try{
            System.out.println("B2 : Thread is created by implementing Runnable interface.");
            Thread.sleep(1000);    //1000 millis = 1 sec
        }
        catch (InterruptedException e){
            System.out.println("Exception in thread handling!");
        }
    }
}


public class _2_1_CreatingMultipleThreads_MT {
    public static void main(String[] args) {

        //////////// Creating Objects of classes which extends Thread class ////////////
        A1 tA1=new A1();
        B1 tB1=new B1();
        tA1.start();    // Execute Thread of A1 by invoking start().
        tB1.start();    // Execute Thread of B1 by invoking start().

        //////////// Creating Objects of classes which implements Runnable interface ////////////
        A2 obj1=new A2();
        B2 obj2=new B2();
        Thread tA2=new Thread(obj1);    // Create thread object of A2's object(obj1)
        Thread tB2=new Thread(obj2);    // Create thread object of B2's object(obj2)
        tA2.start();    // Execute Thread of A2 by invoking start().
        tB2.start();    // Execute Thread of B2 by invoking start().

    }
}
