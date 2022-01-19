/*Polymorphism:-Polymorphism is a mechanism which allows to have many forms of the method having the same name.
->>There are two types of Polymorphism
   1] Static Polymorphism (Compile time Polymorphism)
        -> achieve by the Overloading methods
   2] Dynamic Method Dispatch (Run time Polymorphism)
        -> Determined by Java Virtual Machine(JVM)
        -> achieve by the Overriding methods
*/

package ObjectOrientedThinking_And_Terminologies;
class A{
    @Override
    public String toString() {
        return "A";
    }
}

class B extends A{
    @Override
    public String toString(){
        return "B";
    }
}

class C extends B{
    @Override
    public String toString(){
        return "C";
    }
}

public class _9_PolymorphismConcept_OOTT {

    //Method invocation determined at the compile time[compile time Polymorphism]
    public static void fun(Object x){
        System.out.println(x.toString());
    }

    //Method invocation determined at the compile time[Compile time Polymorphism]
    public static void fun(Object x,Object y){
        System.out.print(x.toString()+" and ");
        System.out.println(y.toString());
    }

    public static void main(String[] args) {
        fun(new A());   //invokes the method toString() of class A
        fun(new B(),new C());   //invokes the method toString() of class B and class C.
    }
}
