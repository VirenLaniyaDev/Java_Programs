package ObjectOrientedThinking_And_Terminologies;

class Base1{
    Base1(){
        System.out.println("I am a Base1 class constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor of Base1 with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    //when Derived1() is called then first it can invoke Base1() constructor.
    Derived1(){
        System.out.println("I am a derived class constructor");
    }
    //when Derived1(x,y,z) is called..
    Derived1(int x, int y){
        super(x);   //then first super(x) is execute and it can invoke Base1(x) constructor.
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}

class ChildOfDerived1 extends  Derived1{
    //when ChildOfDerived1() is called then first it can invoke Derived1() constructor.
    ChildOfDerived1(){
        System.out.println("I am a child of derived constructor");
    }
    //when ChildOfDerived1(x,y,z) is called..
    ChildOfDerived1(int x, int y, int z){
        super(x, y);    //then first super(x,y) is execute and it can invoke Derived1(x,y) constructor.
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}

public class _6_Constructor_in_Inheritance_OOTT {
    public static void main(String[] args) {
        System.out.println("-----------------------|-------------------------------");
        System.out.println("1.For Derived class..  |");
        System.out.println("-----------------------|");
        Derived1 Dobj1=new Derived1();
        System.out.println("..");
        Derived1 Dobj2=new Derived1(10,20);
        System.out.println("-------------------------------|-----------------------");
        System.out.println("2.For ChildOfDerived1 class..  |");
        System.out.println("-------------------------------|");
        ChildOfDerived1 CODobj1=new ChildOfDerived1();
        System.out.println("..");
        ChildOfDerived1 CODobj2=new ChildOfDerived1(12, 13, 15);
        System.out.println("-------------------------------------------------------");
    }
}
