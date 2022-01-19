package ExceptionHandling;

import java.util.*;
public class _3_NestedTryCatch_EH {
    public static void main(String[] args) {
        //level 1
        try{
            System.out.println("this is level 1 try block");
            int []arr=new int[5];
            //System.out.println(arr[10]);  //control goes to level 1 catch block
              //level 2
              try {
                  int a=100,b=0;
                  float c=a/b;    //if occurs any exception then control goes to level 2 catch block.
                  System.out.println("this is level 2 try block");
                  System.out.println(c);
                  System.out.println("close of level 2 try block");
              }
              catch(ArithmeticException e){
                  System.out.println("exception handled at level 2 catch block.");
              }
            int c=10/0; // here exception occurs so control goes to level 1 catch.
            System.out.println("close of level 1 try block");
        }

        catch (Exception e){
            System.out.println("exception handled at level 1 catch block.");
        }
    }
}
