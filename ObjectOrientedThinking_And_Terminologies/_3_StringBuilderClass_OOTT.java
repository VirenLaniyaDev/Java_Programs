/*StringBuilder class:-StringBuilder class Class is used for create a mutable(modifiable) String.
->>It is same as to StringBuffer class but non-synchronized.
->>all the methods are same to same as StringBuffer.
->>It is not thread-safe.*/


package ObjectOrientedThinking_And_Terminologies;

public class _3_StringBuilderClass_OOTT {
    public static void main(String[] args) {

        //Constructors in Buffer Class.
        /*1.*/StringBuilder name1=new StringBuilder();    //creates an empty string builder with the initial capacity of 16.
        /*2.*/StringBuilder name2=new StringBuilder(100);    //creates an empty string builder with the specified capacity as length.
        /*3.*/StringBuilder name3=new StringBuilder("Rangnar");    //creates a string builder with the specified string.


        //Some Methods in Buffer Class.
        /*1.*/System.out.println("1.append:->"+name3.append(" Lodbrok"));   /*append the specified string with this string.
                                                                              The append() method is overloaded like append(char),
                                                                              append(boolean), append(int), append(float), append(double) etc.*/

        /*2.*/System.out.println("2.insert:->"+name3.insert(8,"bjorn "));   /*used to insert the specified string with this string at the specified position.
                                                                                     The insert() method is overloaded like insert(int, char),
                                                                                     insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.*/

        /*3.*/System.out.println("3.replace:->"+name3.replace(0, 7, "Jaguar"));     /*used to replace the string from
                                                                                                   specified startIndex and endIndex.*/

        /*4.*/System.out.println("4.delete:->"+name3.delete(7,13));     /*used to delete the string from specified startIndex and endIndex.*/

        /*5.*/System.out.println("5(1).substring:->"+name3.substring(7));  /*used to return the substring from the specified beginIndex*/
        System.out.println("5(2).substring:->"+name3.substring(0,6));     /*used to return the substring from the specified beginIndex and end Index.*/

        /*6.*/System.out.println("6.reverse:->"+name3.reverse());   /*used to reverse the string.*/

        /*7.*/System.out.println("7.character position:->"+name3.charAt(7));    /*return the character at the specified position.*/

        /*8.*/System.out.println("8.length:->"+name3.length());     /*return length of the string.*/
        System.out.println("  length:->"+name2.length());


        /*9.*/StringBuilder name4=new StringBuilder();//null string with 16 capacity.
        name4.append("viren");
        System.out.println("9.capacity:->"+name4.capacity()); /*return the current capacity.*/
        System.out.println("  capacity:->"+name2.capacity());
        name4.append("patel is a honest boy.");
        System.out.println("  capacity:->"+name4.capacity()); /*return 34 capacity because 16 is full then new capacity like this
                                                                        (OldCapacity*2)+2*/

        /*10.*/name3.ensureCapacity(30);   //used to ensure the capacity at least equal to the given minimum.
        System.out.println("10.ensure capacity:->"+name4.capacity());   //if it is not greater than capacity then (OldCapacity*2)+2
    }
}
