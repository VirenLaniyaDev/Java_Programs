/**-->Syntax:
 *      try{
 *          //code that may throw an exception.that also known as risky code.
 *      }
 *      catch(Exception_type reference_variable_name) {
 *          //code to handle exception which produce by try.
 *      }
 *      catch(Exception_type reference_variable_name) {
 *          //code to handle exception which produce by try.
 *      }
 *      .
 *      .
 *      .
 */

package ExceptionHandling;

import java.util.Scanner;

public class _4_MultipleCatch_EH {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int []a=new int[3];
        System.out.println("Enter second array size");
        int []b=new int[sc.nextInt()];

        try{
            if(b.length==a.length){
                System.out.println(3/b[0]);
            }
            for(int i=0;i<=a.length;i++){
                a[i]=i+1;
            }
        }

        catch(ArrayIndexOutOfBoundsException arre){
            System.out.println("Array Index is out of Bounds.");
            System.out.println("Exception is:"+arre);
        }

        catch(ArithmeticException ae){
            System.out.println(" divide by 0 is not possible.");
            System.out.println("Exception is:"+ae);
        }
    }
}
