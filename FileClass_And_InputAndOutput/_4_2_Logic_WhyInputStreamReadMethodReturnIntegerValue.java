/** Question1 : Why 'read()' does return int value and not byte value?
 * Answer : Because a byte can only hold -128 until 127, while it should return 0 until 255 (and -1 when there's no byte
 *          left (i.e. EOF)). Even if it returned byte, there would be no room to represent EOF.
 *
 *  Question2 : A more interesting question is why it doesn't return short?
 *  Answer :  because int is faster than short. The instruction set for short is rather limited, so the JVM would treat
 *            it like an int anyway.
 *
 *  Let us see one example...
 */

package FileClass_And_InputAndOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class _4_2_Logic_WhyInputStreamReadMethodReturnIntegerValue {
    public static void main(String[] args) throws IOException {

        //byte hold only -128 to 127 [Where each number represent character or Special character].
        System.out.println("For Byte [-128 to 127]");
        System.out.println("------");
        byte b=-128;
        for(int i=0;i<256;i++){
            System.out.print((char)b);
            b++;
        }

        /*But The value byte is returned as an int in the range 0 to 255. It means that value of -128 until 0 has been
        * ignored.*/
        System.out.println("\nFor Byte which return int value [0 to 255]");
        System.out.println("------");
        int j=b+128;
        for(int i=0;i<256;i++){
            System.out.print((char)j);
            j++;
        }
        System.out.println("\n-------------------------------------------------------");
        /*Now we read one file.*/
        FileInputStream fin=new FileInputStream("src\\FileClass_And_InputAndOutput\\Logic_4_2.txt");
        int i;
        while((i=fin.read())!=-1){
            System.out.print((char)i);
        }
        /*Here in file ￥ and ￦ both is present but The value byte is returned as an int in the range 0 to 255. so that
        * is not print as it is. Similarly apply for 128 to 255 it can not print as it is, because byte range is till
        * 127 so 0 until 127 print as it is. Above 127 all character consider as special character. */

        //If there no byte left then it simply it return '-1' and it indicate no byte left for print.

        /*Conclusion:
        --> It returns an int because when the stream can no longer be read, it returns -1.
        --> If it returned a byte, then -1 could not be returned to indicate a lack of input because -1 is a valid byte.
            In addition, you could not return value above 127 or below -128 because Java only handles signed bytes.
        --> Many times when one is reading a file, you want the unsigned bytes for your processing code. To get values
            between 128 and 255 you could use a short, but by using an int you will align the memory registers with your
            data bus more efficiently. As a result, you don't really lose any information by using an int, and you
            probably gain a bit of performance. The only downside is the cost of the memory, but odds are you won't be
            hanging on to that int for long (as you will process it and turn it into a char or byte[]).*/
    }
}
