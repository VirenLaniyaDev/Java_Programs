/** Using bounded types, we can make the objects of generic class to have data of specific derived types.
 * --> Syntax fot declaring Bounded type parameters:
 *              <T extends SuperClass>
 * --> For example : If we want a generic class that works only with numbers (like int,double,float..) then declare
 *                  type parameter of that class as a bounded type to Number.*/


package Generics;

class Test<T extends Number>{
    T val;
    Test(T val){
        this.val=val;
    }

    public T getVal() {
        return val;
    }

    void GetType(){
        System.out.println(val.getClass().getSimpleName());
    }
}
public class _4_BoundedTypeParameter {
    public static void main(String[] args) {
        // Passing Number as a type parameter
        Test<Number> test=new Test<Number>(10);     //Possible. Number class also extend to it self.
        System.out.println("The value is : "+test.getVal());
        test.GetType();

        // Passing Number as a type parameter
        Test<Integer> test1=new Test<Integer>(10);  // Possible. Because Integer inherits Number class.
        System.out.println("The value is : "+test.getVal());
        test.GetType();

        // Passing String as a type parameter
//        Test<String> test2=new Test<String>("Viren");     //Compile time error : String is not extends Number class.

        //--> Similarly Any other class which is not inherits Number class that is not possible to pass as a type parameter.
    }
}
