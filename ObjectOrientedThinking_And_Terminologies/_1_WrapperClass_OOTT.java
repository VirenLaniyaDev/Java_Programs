/**-->The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
->Wrapper classes are those classes that allow primitive data types to be accessed as objects.*/

package ObjectOrientedThinking_And_Terminologies;

public class _1_WrapperClass_OOTT {
    public static void main(String[] args) {

        //1.Different between Wrapper and primitive data types..
        int a=100;  //primitive data type example
            // here 'a' is simple variable which contains integer value '100'.

        Integer b=200;
            //here 'b' is object and The 'Integer' class wraps a value of the primitive type 'int' in an object.

        System.out.println("1.Wrapper class declaration vs Primitive data type declaration");
        System.out.println("a="+a);
        System.out.println("b="+b);

        System.out.println();

        //2.'parse' use convert string to digits.
        System.out.println("2.Use of 'parse'");
        String str1="100";
        String str2="200";
        System.out.println(str1+str2);  //it just combine str1 and str2 not perform arithmetic.

        Integer p2=Integer.parseInt(str2);
        Integer p1=Integer.parseInt(str1);
        System.out.println(p2+p1);

        System.out.println();

        //3.boxing and unboxing
        System.out.println("3.Boxing and Unboxing");
            //Normal boxing
        int c=100;
        Integer d=Integer.valueOf(c);
        System.out.println("d="+d);

            //Auto boxing
        Integer f=c;
        System.out.println("f="+f);

            //Normal unboxing
        System.out.println("f="+f.intValue());
            //Auto unboxing
        System.out.println("f="+f);

        System.out.println();

        //4.conversion
        System.out.println("4.conversion");
        int i=20;
        String j=Integer.toBinaryString(i);
        System.out.println("binary equivalent:"+j);
    }
}
