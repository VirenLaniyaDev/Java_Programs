/** Write a program to accept a password from the user and throw "Authentication Failure" exception if the password is
 *  incorrect.*/

package ExceptionHandling;

import java.util.Scanner;

class PasswordException extends Exception {
    PasswordException(String msg){
        super(msg);
    }
}

public class Example_2_PasswordChecker_EH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your password");
        String pw=sc.next();
        try{
            if(!pw.equals("abc123"))
                throw new PasswordException("Incorrect password");
            else
                System.out.println("Welcome");
        }
        catch(PasswordException pe){
            System.out.println(pe.getMessage());
        }
    }
}
