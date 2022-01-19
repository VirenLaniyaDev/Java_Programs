/**--> The wildcard in generics and represent an unknown type. Which is denoted by Question mark(?).
 * --> The wildcard can be used as type of parameter, field, or local variable and sometimes as a return type.
 * --> We can't use wildcard while invoking a generic method or instantiating a generic class.
 *
 * There are three ways to use wildcards
 * 1) Unbounded wildcard
 * 2) Upper bound wildcard
 * 3) Lower bound wildcard*/

package Generics;

import java.util.Arrays;
import java.util.List;

public class _5_WildcardGenericTypes {
    public static void main(String[] args) {

        // Integer Array list
        List<Integer> list=Arrays.asList(10,20,30,40,50);
        DisplayUnbWildcard(list);   //Unbounded wildcard
        DisplayUpperWildcard(list); //Upper bound wildcard also support Number,Double,float,etc.
        DisplayLowerWildcard(list); //Lower bound wildcard also support Number and Object.

        // String Array list
        List<String> list1=Arrays.asList("Viren","Abhi","Kundan");
        DisplayUnbWildcard(list1);
//        DisplayUpperWildcard(list1);  //Compile time error : Only support that kind of type which is inherits Number class. See in 2)
//        DisplayLowerWildcard(list1);  //Compile time error : Only support that kind of type which is super classes of Integer. See in 3)

    }

    // 1) Unbounded wildcard - When we want our generic method to be work with all types
    // For that we use <? extends Object>. We can also write only <?>; Because default it extends to Object class.
    static void DisplayUnbWildcard(List<?> list){
        System.out.println(list);
    }

    // 2) Upper bound wildcard - used to relax the restriction on the type of variable in a method.
    // Declaration : <? extends [Upper bound name(SuperClass)]>. i.e <? extends Number>
    static void DisplayUpperWildcard(List<? extends Number> list){  //Where ?=Sub classes of Number that are Integer,Double,Float...;We can also use Number.
        System.out.println(list);
    }

    // 3) Lower bound wildcard - use only super classes of provided parameter type
    // Declaration : <? super [Lower bound name(Subclass)]>. i.e <? super Integer>
    static void DisplayLowerWildcard(List<? super Integer> list){   //Where ?=Super classes of Integer that are Number and Object; also support Integer.
        System.out.println(list);
    }
}
