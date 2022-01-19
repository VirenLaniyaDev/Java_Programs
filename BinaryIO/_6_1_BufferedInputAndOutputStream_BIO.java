//BufferedInputStream
/**--> BufferedInputStream is used for read data from stream.
 * --> It internally uses buffer mechanism to make the performance fast.*/
//BufferedOutputStream
/**--> Java BufferedOutputStream class is used for buffering an output stream.
 * --> It internally uses buffer to store data. It adds more efficiency than to write data directly into a stream*/


package BinaryIO;

import java.io.*;

public class _6_1_BufferedInputAndOutputStream_BIO {
    public static void main(String[] args) {

        ///////////////////// BufferedOutputStream /////////////////////
        try{
            FileOutputStream fout=new FileOutputStream("src\\BinaryIO\\text.txt");
            BufferedOutputStream bout=new BufferedOutputStream(fout);   //Buffered Streams only accept file objects
            String str="This is Buffered Stream class.";
            byte []b=str.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            fout.close();
            System.out.println("Written successfully.");
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        ///////////////////// BufferedInputStream /////////////////////
        try{
            FileInputStream fin=new FileInputStream("src\\BinaryIO\\text.txt");
            BufferedInputStream bin= new BufferedInputStream(fin);      ////Buffered Streams only accept file objects
            int i;
            while((i=bin.read())!=-1)
                System.out.println((char)i);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
