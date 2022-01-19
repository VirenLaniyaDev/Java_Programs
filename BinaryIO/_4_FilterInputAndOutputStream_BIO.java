// FilterInputStream class
/**-->  ' public class FilterInputStream extends InputStream '
 * --> Java FilterInputStream class implements the InputStream.
 * --> It contains different sub classes as BufferedInputStream, DataInputStream for providing additional functionality.
 * --> FilterStream classes wrap the input stream with the byte.
 * --> Using Filter Stream classes you can also read integers, doubles or strings.
 * --> Use of this class is less.*/
// FilterOutputStream class
/**--> ' public class FilterOutputStream extends OutputStream '
 * --> FilterOutputStream class implements the OutputStream class.
 * --> It provides different sub classes such as BufferedOutputStream and DataOutputStream to provide additional functionality.
 * --> So it is less used individually.
 * --> Use of this class is less.*/

package BinaryIO;

import java.io.*;

public class _4_FilterInputAndOutputStream_BIO {
    public static void main(String[] args) throws IOException {
        ////////////////////////// FilterOutputStream Class //////////////////////////
        try {
            File data = new File("src\\BinaryIO\\text.txt");
            FileOutputStream file = new FileOutputStream(data);
            FilterOutputStream filter = new FilterOutputStream(file);
            String str = "These are Filter Stream classes.";
            byte b[] = str.getBytes();
            filter.write(b);
            filter.flush();
            filter.close();
            file.close();
            System.out.println("The Content is written successfully to the file.");
        }
        catch(FileNotFoundException FnotE){
            System.out.println("File not found.");
            FnotE.printStackTrace();
        }
        catch(IOException IOE){
            System.out.println("Something was wrong.");
            IOE.printStackTrace();
        }

        ////////////////////////// FilterInputStream Class //////////////////////////
        try {
            File data = new File("src\\BinaryIO\\text.txt");
            FileInputStream file = new FileInputStream(data);
            FilterInputStream filter = new BufferedInputStream(file);   //BufferInputStream() is sub class of FilterInputStream class.
            int k =0;
            System.out.println("----------------------------- Content of File ------------------------------------");
            while((k=filter.read())!=-1){
                System.out.print((char)k);
            }
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
            file.close();
            filter.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
