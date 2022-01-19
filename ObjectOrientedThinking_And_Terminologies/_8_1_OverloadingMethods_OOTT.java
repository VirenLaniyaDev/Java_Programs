/*Overloading:-If a class has multiple methods having same name but different in parameters, it is known as
               Method Overloading.
->>Must be methods name are same and parameters are different.*/


package ObjectOrientedThinking_And_Terminologies;

class OverloadingDemo{
    void fun()
    {
        System.out.println("Method:fun()");
    }
    void fun(int a)     //overloading on fun()..
    {
         System.out.println("Method:fun(a) with value a="+a);
    }
    void fun(int a,int b) //overloading on fun() and fun(a)..
    {
         System.out.println("Method:fun(a,b) with value a="+a+" and b="+b);
    }
}
public class _8_1_OverloadingMethods_OOTT
{
    public static void main(String[] args)
    {
        OverloadingDemo OL=new OverloadingDemo();
        OL.fun();               //OL.fun()->it called fun() method.
        OL.fun(10);          //OL.fun(10)->it called fun(a) method.
        OL.fun(10,20);    //OL.fun(10,20)->it called fun(a,b) method.
    }
}
