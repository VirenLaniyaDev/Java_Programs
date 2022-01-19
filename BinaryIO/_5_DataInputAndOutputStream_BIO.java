//DataInputStream class
/**--> ' public class DataInputStream extends FilterInputStream implements DataInput   '
 * --> Java DataInputStream class allows an application to read primitive data from the input stream in a machine-
 *     independent way.
 * --> Java application generally uses the data output stream to write data that can later be read by a data input stream.
 * --> Methods: Boolean readBoolean(), byte readByte()[also available for char,float,int,long,double], String readLine(),
 *              String readUTF().
 */
//DataOutputStream class
/**-->
 * --> Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a
 *     machine-independent way.
 * --> Java application generally uses the data output stream to write data that can later be read by a data input stream.
 * --> Methods : void writeBoolean(boolean val), void writeBytes(String str), void writeFloat(float val)[avail: Double,Integer, Long],
 *               void writeUTF(String str)
 */

package BinaryIO;
import java.io.*;
public class _5_DataInputAndOutputStream_BIO {
    public static void main(String[] args) throws IOException{
        ////////////////////////// DataOutputStream Class //////////////////////////
        try{
            DataOutputStream fout=new DataOutputStream(new FileOutputStream("src\\BinaryIO\\text.txt"));
            fout.writeUTF("Viren");  //UTF is an encoding scheme that allows systems to operate with both ASCII and Unicode.
                                        // Normally system use ASCII and java uses Unicode.
                                        //->writeUTF convert string in to UTF-8 format and writes them into a binary stream.
            fout.writeDouble(95.83);
            fout.writeUTF("Akshat");
            fout.writeInt(200);
            fout.writeChar('J');
            fout.close();
            /**-->Open your file and check written content. Content will be in encrypted form. It will in UTF-8 format.*/
        }
        catch(IOException IOE){
            IOE.printStackTrace();
        }

        ////////////////////////// DataInputStream Class //////////////////////////
        try{
            DataInputStream fin=new DataInputStream(new FileInputStream("src\\BinaryIO\\text.txt"));
            System.out.println("----------------------------- Content of File ------------------------------------");
            System.out.println(fin.readUTF()+" : "+fin.readDouble());
            System.out.println(fin.readUTF()+" : "+fin.readInt());
            System.out.println(+fin.readChar());
            System.out.println("----------------------------------------------------------------------------------");
        }
        catch(IOException IOE){
            IOE.printStackTrace();
        }
    }
}
