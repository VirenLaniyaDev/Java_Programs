/**  << Important Topic >>
->>Special Cases of Method Overloading
1.Can we achieve Method Overloading by changing the return type of method only?
2.Can we overload java main() method?
3.Method Overloading and Type Promotion
4.Different cases of Type Promotion
5.Variable 'varargs' case
*/


package ObjectOrientedThinking_And_Terminologies;

/**1.Can we achieve Method Overloading by changing the return type of method only?*/
/*Ans::-> No,Because if you create same name method by changing return type It is
          not possible to decide to execute which method based on the return type
          and compiler can be confuse.Therefore,overloading is not possible just by
          changing the return type of the method.*/
//Uncomment Case 1 code and check it.It will be throws Error.
/*Case:1*//*class A1{
    void Method1(){
        System.out.println("void method");
    }
    int Method1(){
        System.out.println("int method");
        return 1;
    }
}*/

/**2.Can we overload java main() method?*/
/*Ans::-> Yes, we can overload the main method in Java, but When we execute the class
          JVM starts execution with public static void main(String[] args) method.*/

/**3.Method Overloading and Type Promotion*/
/*Automatic promotion:One type is promoted to another implicitly if no matching datatype is found.
->>Automatic promotion follows given path..
    byte -> sort -> int -> long -> float -> double
    Note: char -> int */
class A3{
    void Method3(double a){
        System.out.println("double method");
    }
    void Method3(String a){
        System.out.println("String method");
    }
}

/**4.Different cases of Type Promotion*/
class A4{
    /*Case 4.1 & 4.2*/
    //Object class is parent class of all the classes.[String,Number,char... -> Object]
    void Method4(Object a){
        System.out.println("Object method");
    }
    void Method4(String a) {
        System.out.println("String method");
    }

    /*Case 4.3*/
    void Method5(StringBuffer a){
        System.out.println("StringBuffer Method");
    }
    void Method5(String a){
        System.out.println("String Method");
    }

    /*Case 4.4*/
    void Method6(int a,float b){
        System.out.println("integer-float method ");
    }
    void Method6(float a,int b){
        System.out.println("float-integer method ");
    }
}

/**5.Variable 'varargs' case*/
class A5{
    void Method7(int a){
        System.out.println("integer method");
    }
    void Method7(int... a){
        System.out.println("varargs method");
    }
}

public class _8_2_SpecialCasesOfOverloading_OOTT {
    public static void main(String[] args) {

        /**Case:1*//*A1 obj1=new A1;
                    obj1.Method1();*/

        System.out.println("Case 2..");
        /**Case:2*/_8_2_SpecialCasesOfOverloading_OOTT obj2=new _8_2_SpecialCasesOfOverloading_OOTT();
                  obj2.main('V');   //'char->int->long->float->double' so char promote double.

        System.out.println("\nCase 3..");
        /**Case:3*/A3 obj3=new A3();
                  obj3.Method3(12);

        System.out.println("\nCase 4.1..");
        /**Case:4.1*/A4 obj4=new A4();
                  obj4.Method4(12);

        System.out.println("\nCase 4.2..");
        /**Case:4.2*/A4 obj5=new A4();
                    obj5.Method4("abc");    /*while resolving Overloaded Methods,Compiler will always give precedence
                                               for the child type arguments than compared with parent  type arguments*/

        System.out.println("\nCase 4.3..");
        /**Case:4.3*/A4 obj6=new A4();
                    obj6.Method5(new StringBuffer());   //It calls StringBuffer method and we provide string then it calls String method.
                    //obj6.Method5(null);       //It is provide an error,because compiler get confuse.

        System.out.println("\nCase 4.4..");
        /**Case:4.4*/A4 obj7=new A4();
                    obj7.Method6(10, 20.5f);    //call Method6(int a,float b)
                    obj7.Method6(10.5f, 20);    //call Method6(float a,int b)
                    //obj7.Method6(10,20);        //here compiler get confuse it will not select particular method.
                    obj7.Method6(10.5f, 'b');   //here compiler is not get confuse because a=float and b=char->int so call Method6(float a,int b)

        System.out.println("\nCase 5..");
        /**Case:5*/A5 obj8=new A5();
                  obj8.Method7(10);         //call Method7(int a)
                  obj8.Method7(10,20,30);  //call Method7(int... a)
    }

    /*Case:2*/public static void main(int a){
        System.out.println("Overloaded main method.");
    }
}
