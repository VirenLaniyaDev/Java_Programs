/**-->finally: It specifies the code that must be executed even though exception may or may not occur.
 * -->Syntax:
 *      try {
 *          //code that may throw an exception.that also known as risky code.
 *      }
 *      catch(Exception_type reference_variable_name) {
 *          //code to handle exception which produce by try.
 *      }
 *      finally {
 *          //code
 *      }
 * Note: Here finally use after try also without catch block,But the problem is exception can not be handled.
 */

package ExceptionHandling;

public class _5_Finally_EH {
    public static void main(String[] args) {
        try {
            int a=100,b=0;
            float c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {   //'finally' block is always executed even exception may occur or not.
            System.out.println("finally block");
        }
    }
}
