package Generics;

import java.util.Arrays;
import java.util.List;

public class _3_2_GenericMethods2 {
    public static void main(String[] args) {
        Integer []iArr = {10, 20, 30, 40, 50};  //Integer array
        method1(iArr);

        String []sArr = {"Apple", "Mango", "Pineapple", "Orange", "Watermelon"};  //String array
//        method1(sArr);    //Compile time error : Invalid provided type!

    }

    // Here T only access that types which is extends to Number class. <T> = <T extends Object>
    static <T extends Number> void method1(T[] val){    //Type which extends to Number class.
        for (T x:val) {
            System.out.println(x);
        }
    }
}
