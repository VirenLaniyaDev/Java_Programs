/**-->Interface : An interface in Java is a blueprint of a class. It has static constants and abstract methods.
 * -->The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java
 *    interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
 * -->Syntax:   interface <interface_name>{
 *                  // declare constant fields
 *                  // declare methods that abstract
 *                  // by default.
 *              }
 */


package AbstractClassesAndInterfaces;

interface Car{
    // Interface fields are public, static and final by default, and the methods are public and abstract.
    int a=10;   //i.e, Compiler automatically takes 'public static final int a=10'
    void Break();       //i.e, Compiler automatically takes 'public abstract void Break()'
    void Accelerator();
}

class Lamborghini implements Car{

    /*Overridden all methods will be public because as per rules of overriding access modifier of overridden method either
      bigger than superclass method or same as superclass method. Same things apply on Interface, Interface act like
      Superclass and all methods in interface is public. so, its necessary to overridden method must be public.*/
    @Override
    public void Break()     //i.e, Here we can't provide private, protected and default as access modifier.Compiler gives en error.
    {
        System.out.println("Applying break on Lamborghini");
    }
    @Override
    public void Accelerator()   //Similar to above example.
    {
        System.out.println("Applying accelerator on Lamborghini");
    }

}
public class _2_1_Interfaces_ACI {
    public static void main(String[] args){
        //Car c=new Car();  //Create an object of interfaces can not be possible.
        Lamborghini lc=new Lamborghini();
        //lc.a=20;    //We can't change value of a because it is final.
        System.out.println(lc.a);
        lc.Break();
        lc.Accelerator();
    }
}
