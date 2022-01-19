/**-->Exception:- An exception is an event that occurs during the execution of a program that disrupts
                  the normal flow of instructions during the execution of a program.
 --> When an error occurs within a method, the method creates an object and hands it off to the runtime system.
     This object contains three fields- Exception name, Description, stacktrace.
 --> Exception has two types:
     i) Compile time exception
     ii)Run time exception
 */

package ExceptionHandling;

public class _1_WhatIsException {
    public static void main(String[] args) {
        int a=100,b=0;
        float c=a/b;        //here arithmetic exception is occurs because a is not divisible by 0.
        System.out.println(c);
    }
}
