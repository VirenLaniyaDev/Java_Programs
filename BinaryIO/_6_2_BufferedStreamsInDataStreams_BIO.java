
package BinaryIO;

import java.io.*;

public class _6_2_BufferedStreamsInDataStreams_BIO {
    public static void main(String[] args) throws IOException {

        ///////////////////// Writing data to file /////////////////////
        try{
            DataOutputStream dout=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src\\BinaryIO\\text.txt")));
            /*                               ↑                    ↑                        ↑
                             DataOutputStream object      Buffer object was declared      FileStream for buffer
                            -> Here DataOutputStream      ->Buffer was created for File.  ->Need to provide file object
                            not directly interact with      Now for the data stream         for buffer.
                            File. It is interact with       Buffer was a file.
                            Buffer.
            */
            dout.writeUTF("This is Data Streams example using Buffer.");
            dout.writeDouble(95.83);
            dout.writeInt(200);
            dout.writeChar('J');
            dout.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        ///////////////////// Reading data from file /////////////////////
        try{
            DataInputStream din=new DataInputStream(new BufferedInputStream(new FileInputStream("src\\BinaryIO\\text.txt")));
            System.out.println("----------------------------- Content of File ------------------------------------");
            System.out.println(din.readUTF()+"  "+din.readDouble()+"  "+din.readInt()+"  "+din.readChar());
            System.out.println("----------------------------------------------------------------------------------");
        }
        catch(IOException IOE){
            IOE.printStackTrace();
        }
    }
}
