/**Inheritance:Inheritance is a mechanism in java which by derived class can borrow properties from base
              and at the same time derived class may have some additional properties.
 ->>In other word new created class(derived class) which has all the properties of base class and may have
    some additional properties.
 ->>It can be achieved by 'extends' keyword.
 ->>Advantages:-1] ReUsability 2]Extensibility 3]Data hiding 4]Overriding*/

package ObjectOrientedThinking_And_Terminologies;

class Parent{
    Parent(){
        System.out.println("Parent");
    }
}

//Single level Inheritance:-Derived class derived from base class
class Child1 extends Parent{
    Child1(){
        System.out.println("Child1 of Parent");
    }
}

//Multilevel Inheritance:-Derived class derived from base class which it self derived class that is called multilevel Inheritance.
class ChildOfChild1 extends Child1{
    ChildOfChild1(){
        System.out.println("Child of Child1(GrandChild of Parent)");
    }
}

//Hierarchical Inheritance:-When two or more derived classes derived from the same base class.
class Child2 extends Parent{
    Child2(){
        System.out.println("Child2 of Parent");
    }
}
class Child3 extends Parent{
    Child3(){
        System.out.println("Child3 of Parent");
    }
}
public class _4_Inheritance_OOTT {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("single level Inheritance");
        Child1 obj1=new Child1();
        System.out.println();
        System.out.println("Multilevel Inheritance");
        ChildOfChild1 obj2=new ChildOfChild1();
        System.out.println();
        System.out.println("Hierarchical Inheritance");
        Child2 obj3=new Child2();
        Child3 obj4=new Child3();
    }
}


