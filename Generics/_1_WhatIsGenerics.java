/**
 * --> Generics mean parameterized types.
 * --> The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects.
 * --> The idea is to allow type (Integer, String, … etc, and user-defined types) to be a parameter to methods, classes, and interfaces.
 * --> Using Generics, it is possible to create classes that work with different data types.
 * --> It makes the code stable by detecting the bugs at compile time.
 * --> Before generics, we can store any type of objects in the collection, i.e., non-generic. Now generics force the
 * java programmer to store a specific type of objects.
 * --> Generics define in Angular brackets - <>
 * <p>
 * ::Advantages of Generics::
 * 1) Type-safety: We can hold only a single type of objects in generics. It doesn't allow to store other objects.
 * 2) Type casting is not require: There is no need to typecast the object.
 * 3) Compile time checking:  It is checked at compile time so problem will not occur at runtime. The good programming
 * strategy says it is far better to handle the problem at compile time than runtime.
 */


package Generics;

import java.util.ArrayList;

public class _1_WhatIsGenerics {
    public static void main(String[] args) {

        ////////////// Without generics //////////////
        ArrayList AL1 = new ArrayList();
        AL1.add("Viren");
        AL1.add(10);
        AL1.add(20);
//         int num = AL1.get(1);   /* Compile time error : When we create ArrayList the initial type is 'Object' because we
//                                    have not declare any type of ArrayList.
//                                    -> Here we the variable 'num' is integer but we provide Object. According to rule
//                                    we didn't assign Superclass value in to subclass here Integer is subclass of Object.
//                                    -> So we require type casting here. after that we can access that value.*/

        int num = (int) AL1.get(1);  //Type casting
        // Suppose we provide (int)AL1.get(0) then error occurs on runtime. That is complicated to solve rather than compile time error.
        System.out.println(num);
        //-> Here we need of type casting and also if you observed we add string as well as integer so we can't afford type safety.

        ////////////// With generics //////////////
        ArrayList<Integer> AL2 = new ArrayList<>();   //We define type of ArrayList that is Integer using generics.
//        AL2.add("Viren");   // Compile time error : We can only provide integer value.
        AL2.add(10);
        AL2.add(20);
        AL2.add(30);
        int num2 = AL2.get(2);    //Here we don't require type casting.
        System.out.println(num2);
        // Here we achieved: Type safety, Type casting is not require, Compile time checking
    }
}
