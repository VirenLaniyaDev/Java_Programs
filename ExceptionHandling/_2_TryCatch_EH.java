/**-->Using following methods we handle Exception
 *    1.try 2.catch 3.finally 4.throw 5.throws
 *-->try: Java try block is used to enclose the code that might throw an exception.
 *-->catch: Java catch block is used to handle the Exception by declaring the type of exception within the parameter.
 *-->Syntax:
 *          try {
 *              //code that may throw an exception.that also known as risky code.
 *          }
 *          catch(Exception_type reference_variable_name) {
 *              //code to handle exception which produce by try.
 *          }
 */


package ExceptionHandling;

public class _2_TryCatch_EH {
    public static void main(String[] args) {
        try {
            int a=100,b=0;
            float c=a/b;
            System.out.println(c);  //If 'float c=a/b;' generate Exception then this statement will not execute.Otherwise it execute.
        }

        catch(ArithmeticException e)    /*->If in 'try' block exception occurs then 'catch' block will execute.
                                          ->If you don't know which exception will occurs then write 'Exception' instead of
                                            'ArithmeticException' because Exception class is parent class of all Exceptions.
                                          ->'e' is a reference variable of exception.*/
        {
            System.out.println(e);
        }
        System.out.println("Program was executed."); //here program was executed normally,because we handled exception.

    }
}
