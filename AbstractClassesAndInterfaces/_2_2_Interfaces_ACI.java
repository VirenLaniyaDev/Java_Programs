/** --> Since Java 8, we can have default and static methods in an interface. And after Java 9, We can have private
 *    methods in an interface.*/

package AbstractClassesAndInterfaces;

interface A{
    default void fun1()     //Since Java 8th version
    {
        System.out.println("fun1[default] in interface A");
    }
    static void fun2()      //Since Java 8th version
    {
        System.out.println("fun2[static] in interface A");
    }
    private void fun3()     //Since Java 9th version
    {
        System.out.println("fun3[private] in interface A");
    }
}
class B implements A{

}

public class _2_2_Interfaces_ACI {
    public static void main(String[] args) {
        A b=new B();
        b.fun1();   //It simply calls fun1 of A
        //b.fun2();   // It throws error because fun2 method is static. And we can not override it.
        A.fun2();   //We can't need any object because fun2 method is static.
        //b.fun3();   //We can not calls fun3 method because it is private. And we cannot override this method.
    }
}
