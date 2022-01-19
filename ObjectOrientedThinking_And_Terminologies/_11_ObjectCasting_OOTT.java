/**->>Casting:- Casting means converting one primitive type to another.
->>Casting of Objects:- Similar to casting, object of one class type can be converted to another class
                        type within the inheritance hierarchy.This conversion is called casting of object.
->>There are two types of castings
    1]implicit casting
    2]explicit casting
        i) Upcasting
        ii)Downcasting
*/

package ObjectOrientedThinking_And_Terminologies;

//Superclass(Base class)
class C1{
    void fun1(){
        System.out.println("function of C1");
    }
    void fun2(){
        System.out.println("function2 of C1");
    }
}
//Subclass(Derived class)
class C11 extends C1 {
    @Override
    void fun1(){
        System.out.println("function1 of C11");
    }
    void fun3(){
        System.out.println("function1 of C11");
    }

}

public class _11_ObjectCasting_OOTT {
    public static void main(String[] args) {

        /**1.implicit casting*/
        System.out.println("implicit casting");
        Object obj1=new C1();   /*We converted object of class C1 to object of class Object.This conversion is called
                                  implicit conversion.*/
        System.out.println(obj1);
        //C1 obj2=obj1;    /*But reverse is not possible because Object is not instance of Class C1,and compiler
        //                 say it is not possible to convert class Object to class C1.*/
        System.out.println("--------------------------------------");

        /**2.explicit casting:-To convert the object of one class type to another class type we should mention the
                               name of destined class.*/
        System.out.println("explicit casting");
        C1 obj2= (C1) obj1;    /*See in implicit 'C1 obj2=obj1' compiler give error.But in explicit case we do not
                                 convert directly.
                                ->'(subclass)' is called cast notation.i.e '(C1)'
                                -> We say to compiler 'obj1' is not a object of Object class, it is object of C1 class
                                   through the cast notation.That is called explicit casting.*/
        System.out.println(obj2);
        System.out.println(".....");

            /**i) Upcasting: Casting the instance of subclass to a superclass is classed upcasting.
                             ->It is very safe because the subclass is by default an instance if its superclass.*/
            System.out.println("Upcasting");
            C11 obj3=new C11();
            C1 obj4=(C1)obj3;

            /*First create object 'obj3' of C11,and convert class type C11 to C1.Here C1 is superclass of subclass C11.
                    C1
              So     ↑   and Upcasting was occurs.
                    C11          */

            // Other ways //
            //C1 obj4=obj3;     /*'obj3' is C11 class type and C11 is subclass of C1.so here not necessary to use cast notation*/
            //C1 obj5=new C11();    /*Using Dynamic method dispatch*/

            System.out.println(obj3);
            System.out.println(obj4);
            obj4.fun1();
            obj4.fun2();
            //obj4.fun3();  /*compiler gives an error because fun3() is not present in class C1*/
            System.out.println(".....");
            /**ii)Downcasting:Casting the instance of superclass to a subclass is called downcasting.
                              ->It is not natural because the superclass is not an instance of subclass.*/
            System.out.println("Downcasting");

            C11 obj6=new C11();
            C1 obj7=obj6;       //Upcasting done automatically
            C11 obj8=(C11)obj7; //Downcasting
                                /*->First object 'obj6' of subclass C11 is created.Then converted into object 'obj7'
                                    which class type C1,that is superclass of C11.
                                  ->After this upcasting we create object 'obj8' which class type is C11 and that is
                                    refer to 'obj7'.
                                  ->But directly 'obj7' is not assign into 'obj8', Because C11 is a subclass of C1.
                                  ->That's why we provide 'obj7' as which class type is C11 via cast notation.
                                        C1
                                  ->so   ↓  and downcasting was occurs.
                                        C11               */
            obj8.fun1();
            obj8.fun2();
            obj8.fun3();
    }
}
