/**
 * Generic method allows a programmer to write a generalized method for the methods of different data types. Suppose we want to print array of integer and array of string.
 * Suppose we want to print array of integer and array of string.
 * Suppose we want to print array of integer and array of string.
 */

/** Suppose we want to print array of integer and array of string.*/
package Generics;

public class _3_1_GenericMethods {

//    ///////////////// Normal Methods /////////////////
//    /*--> Here We need n number of methods to print array.Where n=number of different type which you use
//     * --> We use two type of array so n=2.*/
//    static void DisplayArray(int arr[]) {
//        for (int x : arr) {
//            System.out.print(x + "\t");
//        }
//    }
//
//    static void DisplayArray(String arr[]) {
//        for (String x : arr) {
//            System.out.println(x + "\t");
//        }
//    }

    ///////////////// Generic Method /////////////////
    /*--> Here we need only one method to print all type of array.*/
    static <T> void DisplayArray(T [] arr)   //<T> define generic element. You can consider any character.
    // Where T represent generalized type(like placeholder).
    // Instead of void you can also choose T as return type.
    {
        for (T x : arr)
            System.out.print(x + "\t");
    }


    public static void main(String[] args) {
        Integer []iArr = {10, 20, 30, 40, 50};  //Integer array
        String []sArr = {"Apple", "Mango", "Pineapple", "Orange", "Watermelon"};  //String array

        System.out.println("Integer Array :");
        DisplayArray(iArr); //Remember <T> take only object. So that we can't enter int []iArr we need to enter Object of Integer.
        System.out.println("\nString Array :");
        DisplayArray(sArr);
    }
}
