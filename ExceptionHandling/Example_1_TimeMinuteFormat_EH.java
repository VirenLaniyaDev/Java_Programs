/** Write an exception class for a time of day that can accept only 24 hours representation of clock hours. Write a java
 *  program to input various formats of timings and throw suitable error messages.
 */

package ExceptionHandling;

import java.util.Scanner;

class HourException extends Exception{
    HourException(){
        super("Not valid format");
        System.out.println("Oops!! Please enter valid Hour format..");
    }
}
class MinuteException extends Exception{
    MinuteException(){
        System.out.println("Oops!! Please enter valid Minute format..");
    }
}

public class Example_1_TimeMinuteFormat_EH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours in hh format:");
        int h=sc.nextInt();
        System.out.println("Enter minutes in mm format:");
        int m=sc.nextInt();
        try {
            if( h<0 || h>24)
                throw new HourException();
        }
        catch(HourException he){
            he.printStackTrace();
        }
        try {
            if( m<0 || m>59)
                throw new MinuteException();
        }
        catch(MinuteException me){
                me.printStackTrace();
        }

        if (h>0 && h<24 && m>0 && m<60){
            System.out.println("Your time format is "+h+":"+m);
        }
    }
}
