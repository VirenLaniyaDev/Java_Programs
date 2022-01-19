/**--> The caught exception can be rethrown in the catch block. This re-thrown exception needs to be handled by another
 *     catch block somewhere in the program, otherwise the program gets terminated abruptly.*/

package ExceptionHandling;

public class _8_RethrowConcept_EH {
    public static void main(String[] args) {
        try{
            display();
        }
        catch(NullPointerException ne){
            System.out.println("Handled rethrown exception by catch block of main method");
        }
    }

    public static void display(){
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch(NullPointerException ne){
            System.out.println("Rethrow by catch block of display method"); /*The Exception is rethrown here.It is then
                                                                              handled in the catch block of main()*/
            throw ne;
        }
    }
}
