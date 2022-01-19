/*Definition:-The super keyword in Java is a reference variable which is used to refer immediate parent class object
->>Usage of super Keyword:
1.super can be used to refer immediate parent class instance variable.
2.super can be used to invoke immediate parent class method.
3.super() can be used to invoke immediate parent class constructor.*/

package ObjectOrientedThinking_And_Terminologies;

//1.super can be used to refer immediate parent class instance variable.
class ParentClass1{
    int a=10;   //Instance variable
}

class ChildClass1 extends ParentClass1{
    int a=20;
    void print(){
        System.out.println("a="+super.a);    //'super.a'->super keyword refer to instance variable 'a' of ParentClass1.
    }
}
class ChildClass2 extends ChildClass1 {
    int a = 30;
    void print(){
        System.out.println("a=" + super.a);   //'super.a'->super keyword refer to instance variable 'a' of ChildClass1.
    }
}

//2.super can be used to invoke immediate parent class method.
class ParentClass2{
    //Parent class method
    void print(){
        System.out.println("Method of ParentClass2.");
    }
}

class ChildClass3 extends ParentClass2{
    //for invoke parent class method need one method and in which we invoke parent method.
    void call(){
        super.print();    //'super.print()'->super keyword invoke method 'print()' of ParentClass2.
    }
}

//3.super() can be used to invoke immediate parent class constructor.
class ParentClass3{
    //Constructor of ParentClass3
    ParentClass3(int a){
        System.out.println("Constructor of ParentClass3");
        System.out.println("a="+a);
    }
}

class ChildClass4 extends ParentClass3{
    //if parameter of constructor of parent class is nothing then it can called automatically.
    /*and if parameter take some value of constructor of parent class as arguments then super() is helpful.Because it is
      called directly.*/
    ChildClass4(){
        super(111);      //'super(111)'->super(111) invoke ParentClass3 constructor and reuse like ParentClass3(111).
    }

}

public class _5_SuperKeyword_Inheritance {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("1.refer parent class instance variable");
        ChildClass1 obj1=new ChildClass1();
        obj1.print();
        ChildClass2 obj2=new ChildClass2();
        obj2.print();
        System.out.println("------------------------------------------");
        System.out.println("2.invoke parent class method.");
        ChildClass3 obj3=new ChildClass3();
        obj3.call();
        System.out.println("------------------------------------------");
        System.out.println("3.invoke parent class constructor.");
        ChildClass4 obj4=new ChildClass4();
        System.out.println("------------------------------------------");

    }
}
