/** Copy one file text to another file.*/

package BinaryIO;
import java.io.*;

public class Example_1_CopyTextFromOnefileToAnother_BIO {
    public static void main(String[] args) throws IOException{
        //Here we take buffered stream because it is fast compare to other stream.
        BufferedInputStream bin=null;
        BufferedOutputStream bout=null;

        try{
            bin=new BufferedInputStream(new FileInputStream("src\\BinaryIO\\Example_1_CopyTextFromOnefileToAnother_BIO.java"));
            bout=new BufferedOutputStream(new FileOutputStream("src\\BinaryIO\\text.txt"));

            for(int i=bin.read();i!=-1; i=bin.read())       /* bin reads a character from input file util end.*/
                bout.write((char)i);                        /* bout write characters which is read by input stream in other file*/
            bin.close();
            bout.close();
            bout.flush();
            System.out.println("Write successful.");    //Check your file content will be copied.
            System.out.println("----------------------------- Content of File ------------------------------------");
            BufferedInputStream bin2=new BufferedInputStream(new FileInputStream("src\\BinaryIO\\text.txt"));
            for (int i=bin2.read();i!=-1;i= bin2.read())
                System.out.print((char)i);
            System.out.println("----------------------------------------------------------------------------------");
            bin2.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
