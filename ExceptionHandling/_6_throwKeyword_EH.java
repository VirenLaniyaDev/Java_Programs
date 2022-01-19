/**--> throw keyword:The Java throw keyword is used to explicitly throw an exception.
 * --> The throw keyword is mainly used to throw custom exception.
 * --> We can throw either checked or unchecked exception in java by throw keyword, but mostly use in unchecked
 *     exception.
 * --> whenever we throw exception using throw keyword it terminates the flow of program.
 */

package ExceptionHandling;

import java.util.Scanner;

class AgeChecker extends RuntimeException{             // Custom Exception Class (User Defined exception)
    AgeChecker(String msg){
//       System.out.println(msg);
        super(msg);
    }
}

public class _6_throwKeyword_EH {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();

        try {
            if (age < 18) {
                throw new AgeChecker("You are not eligible to Voting.");/*here throw create custom object of exception
                                                                               which contains exception class name,Description,
                                                                               stacktrace information.*/
            }
            else
                System.out.println("You are eligible to voting.(18+)");
        }
        catch(AgeChecker e){
            System.out.println("please try after "+(18-age)+" year");
            e.printStackTrace();
        }
        System.out.println("Program will be executed successfully.");
    }
}
