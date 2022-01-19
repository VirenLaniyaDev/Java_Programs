/** 'instanceof' operator is used to test whether the object is an instance of
     the specified type (class or subclass or interface).
 ->> It will be return boolean value(true or false).*/

package ObjectOrientedThinking_And_Terminologies;

class D1{ }
class D11 extends D1{}
public class _12_instanceofOperatorOOTT {
    public static void main(String[] args) {

        System.out.println("Instance of examples:" );
        System.out.println("----");

        D1 obj1=new D1();
        System.out.println("for obj1..");
        System.out.println(obj1 instanceof Object);
        System.out.println(obj1 instanceof D1);
        System.out.println(obj1 instanceof D11);
        System.out.println("----");

        D11 obj2=new D11();
        System.out.println("for obj2..");
        System.out.println(obj2 instanceof Object);
        System.out.println(obj2 instanceof D1);
        System.out.println(obj2 instanceof D11);
        System.out.println("----");

        D1 obj3=new D11();  //upcasting
        System.out.println("Upcasting");
        System.out.println(obj3 instanceof Object);
        System.out.println(obj3 instanceof D1);
        System.out.println(obj3 instanceof D11);
        System.out.println("----");

        D11 obj4=(D11)obj3;  //Downcasting
        System.out.println("Downcasting");
        System.out.println(obj4 instanceof Object);
        System.out.println(obj4 instanceof D1);
        System.out.println(obj4 instanceof D11);
        System.out.println("----");

    }
}
