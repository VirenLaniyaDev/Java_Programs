//Reader Class
/**--> Java Reader is an abstract class for reading character streams.
 * --> Some of the implementation class are BufferedReader, CharArrayReader, FilterReader, InputStreamReader,
 *     PipedReader, StringReader.*/
//Writer Class
/**--> It is an abstract class for writing to character streams.*/


package FileClass_And_InputAndOutput;

import java.io.*;

public class _2_ReaderAndWriterClasses_FIO {
    public static void main(String[] args) {
        ///////////////////////// Writer /////////////////////////
        try {
            Writer w = new FileWriter("src\\FileClass_And_InputAndOutput\\test.txt");
            String input="This is demo of Reader and Writer class.";
            w.write(input);
            w.close();
            System.out.println("Content written successfully.");
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        ///////////////////////// Reader /////////////////////////
        try {
            Reader r = new FileReader("src\\FileClass_And_InputAndOutput\\test.txt");
            int i=r.read();
            while(i!=-1) {
                System.out.print((char)i);
                i=r.read();
            }
            r.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
