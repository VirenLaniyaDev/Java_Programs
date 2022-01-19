//Buffered reader
/**--> Java BufferedReader class is used to read the text from a character-based input stream.
 * --> When we create Buffer object, the buffer is created in system.
 * --> Buffer is like Middle man.
 *          File --to-->  Buffer --to--> Read
 *          but in Direct read  File --to--> Read
 * --> It can be used to read data line by line by readLine() method. So it makes performance fast rather then reader class.
 * --> Declaration:
 *      public class BufferedReader extends Reader
 */
//Buffered Writer
/**--> Java BufferedWriter class is used to provide buffering for Writer instances.
 * --> When we create Buffer object, the buffer is created in system.
 * --> Write --to--> Buffer --toWrite--> File
 *     but in Direct read Write --to--> File
 * --> The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
 * --> Declaration:
 *      public class BufferedWriter extends Writer*/


package FileClass_And_InputAndOutput;

import java.io.*;

public class _3_BufferedReaderAndWriterClasses_FIO {
    public static void main(String[] args) {
        ///////////////////////// BufferedWriter /////////////////////////
        try {
            FileWriter FileW=new FileWriter("src\\FileClass_And_InputAndOutput\\test.txt");
            BufferedWriter BW = new BufferedWriter(FileW);
            String input="This is demo of BufferedReader and BufferedWriter class.";
            BW.write(input);
            BW.close();
            System.out.println("Content written successfully.");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        ///////////////////////// BufferedReader /////////////////////////
        try {
            FileReader FileR = new FileReader("src\\FileClass_And_InputAndOutput\\test.txt");
            BufferedReader BR=new BufferedReader(FileR);
            int i=BR.read();
            while(i!=-1) {
                System.out.print((char)i);
                i=BR.read();
            }
            BR.close();
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
