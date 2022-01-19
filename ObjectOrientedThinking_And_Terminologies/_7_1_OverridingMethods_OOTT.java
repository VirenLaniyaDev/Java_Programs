/**Overriding:-Overriding is a mechanism in which a subclass inherits the methods of superclass and sometimes the
              subclass modifies the implementation of method defined in superclass.
->>In other words If subclass (child class) has the same method as declared in the parent class, it is known as
   method overriding in Java.
->>The overridden method must be called from the subclass.
->>In overriding parameters are same.*/

package ObjectOrientedThinking_And_Terminologies;

class Base{
    int a=10;
    void fun(){
        System.out.println("I am a Base class method with valur of a="+a);
    }
}
class Derived extends Base{
    int a=20;

    @Override   //@Overriding is not necessary but helpful,when ever overriding was not happen it will be throws the error.
    void fun(){
        System.out.println("I am a Derived class method with value of a="+a);
    }
}

public class _7_1_OverridingMethods_OOTT {
    public static void main(String[] args) {
        Derived obj=new Derived();
        obj.fun();  //It will be called fun() method of Derived class.
    }
}
