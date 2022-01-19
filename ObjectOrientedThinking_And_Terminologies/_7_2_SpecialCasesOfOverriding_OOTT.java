/**    << Important Topic >>
->>Special Cases of Method Overriding
1.Do overriding method must have same return type(subtype)?
2.Access-modifier case in overriding
*/

package ObjectOrientedThinking_And_Terminologies;

/**1.Do overriding method must have same return type(subtype)?*/
/*Ans::->No it is not necessary but w.r.t. covariant return type.Java 5.0 onwards it is possible to have
         different return type for a overriding method in child class, but child’s return type
         should be sub-type of parent’s return type or same .Overriding method becomes variant with
         respect to return type.*/
class B1{
    //Object class is parent class of all the classes.
    Object Method1(){
        System.out.println("Parent class Method");
        return null;
    }
}
class B11 extends B1{
    @Override
    String Method1(){
        return "Child class Method";
    }
}

/**2.Access-modifier case in overriding*/
/*Ans::->The access modifier for an overriding method can allows higher the access scope or same
         access scope,it cannot allows lower the access scope.
->>order of Access-modifiers
   High     1.public
    ↓       2.protected
    ↓       3.Default
   low      4.private
*/
class B2{
    //protected is a lower access-modifier than public
    protected void Method2(){
        System.out.println("Parent class method have public modifier");
    }
}
class B22 extends B2{
    //public is a higher access-modifier of all access-modifiers
     public void Method2(){
        System.out.println("Child class method have default modifier");
    }
}


public class _7_2_SpecialCasesOfOverriding_OOTT {
    public static void main(String[] args) {
        System.out.println("Case 1..");
        B11 obj1=new B11();
        System.out.println(obj1.Method1());
        System.out.println("Case 2..");
        B22 obj2=new B22();
        obj2.Method2();

    }
}
