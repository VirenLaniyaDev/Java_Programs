/**-->throws: The Java throws keyword is used to declare an exception. It gives an information to the programmer that
 *            there may occur an exception so it is better for the programmer to provide the exception handling code so
 *            that normal flow can be maintained.
 * -->Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such
 *    as NullPointerException, it is programmers fault that he is not performing check up before the code being used.
 * -->throws used only for checked exception.
 * -->Syntax:
 *      return_type method_name() throws exception_class_name,exception_name,...{
 *          //method code
 *      }
 */

package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileDisplay{
    void Search() throws FileNotFoundException {
        //FileReader fr=new FileReader("D:/instanceof.txt");  //File exists
        FileReader fr=new FileReader("D:/abc.txt");  //File does not exists
    }
}

public class _7_throwsKeyword_EH {
    public static void main(String[] args) {
        FileDisplay fd=new FileDisplay();
        try {
            fd.Search();
            System.out.println("File Founded");
        }
        catch(Exception e){
            System.out.println("File not found");
        }
    }
}
