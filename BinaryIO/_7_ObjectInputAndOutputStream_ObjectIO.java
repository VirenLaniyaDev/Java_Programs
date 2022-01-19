/**--> Object I/O is also like Binary I/O but its provide some additional features
 * like...
 * perform I/O operation for addition to primitive data types.
 *
 * --> public class ObjectInputStream extends InputStream implement ObjectStreamConstant, ObjectInput
 * --> public class ObjectOutputStream extends InputStream implement ObjectStreamConstant, ObjectOutput*/

package BinaryIO;

import java.io.*;

public class _7_ObjectInputAndOutputStream_ObjectIO {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream Oout=new ObjectOutputStream(new FileOutputStream("src\\BinaryIO\\text.txt"));
        Oout.writeObject(new java.util.Date());     //Write object to the file
        Oout.close();

        ObjectInputStream Oin=new ObjectInputStream(new FileInputStream("src\\BinaryIO\\text.txt")) ;
        java.util.Date date=(java.util.Date)(Oin.readObject());  //Reading object from the file
        System.out.println("The date is :"+date);
        Oin.close();
    }
}
