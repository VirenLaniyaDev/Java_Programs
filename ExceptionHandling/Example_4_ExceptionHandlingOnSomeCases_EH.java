/** Write a complete program to accept N integer numbers from the command line. Raise and exceptions for following cases:
 *  -when a number is -ve
 *  -when a number is evenly divisible by 10
 *  -when a number is greater than 1000 and less than 2000
 *  -when a number is greater than 7000
 *  Skip the number if an exception is raided for it, otherwise add it to find total sum.
 */

package ExceptionHandling;

import java.util.Scanner;

class NegativeNumberException extends RuntimeException{
    NegativeNumberException(String msg){
        super(msg);
    }
}

class DivideBy10Exception extends RuntimeException{
    DivideBy10Exception(String msg){
        super(msg);
    }
}

class RangeException extends RuntimeException{
    RangeException(String msg){
        super(msg);
    }
}

class GreaterThan7000Exception extends RuntimeException{
    GreaterThan7000Exception(String msg){
        super(msg);
    }
}


public class Example_4_ExceptionHandlingOnSomeCases_EH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter number of integers:");
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter integer "+(i+1));
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            try {
                if (a[i] < 0)
                    throw new NegativeNumberException("Exception: " + a[i] + " is Negative integer");
                if (a[i] % 10 == 0)
                    throw new DivideBy10Exception("Exception: " + a[i] + " is Divisible by 10");
                if (a[i] > 1000 && a[i] < 2000)
                    throw new RangeException("Exception: " + a[i] + " is greater then 1000 and less than 2000");
                if (a[i] > 7000)
                    throw new GreaterThan7000Exception("Exception: " + a[i] + " is greater then 7000");
            }
            catch(NegativeNumberException ne){
                System.out.println(ne.getMessage());
                a[i]=0;
            }
            catch(DivideBy10Exception de){
                System.out.println(de.getMessage());
                a[i]=0;
            }
            catch(RangeException re){
                System.out.println(re.getMessage());
                a[i]=0;
            }
            catch(GreaterThan7000Exception e){
                System.out.println(e.getMessage());
                a[i]=0;
            }
        }

       for (int i=0;i<n;i++){
           sum=sum+a[i];
       }
        System.out.println("sum: "+ sum);
    }
}
