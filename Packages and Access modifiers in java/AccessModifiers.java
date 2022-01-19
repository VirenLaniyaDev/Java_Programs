/** There are four types of access modifier :
 * 1) public    2) protected    3) Default    4) private
 *
 * Access modifier |    class    package    subclass    world
 * -----------------------------------------------------------
 *  Public         |      Y         Y           Y         Y
 *  Protected      |      Y         Y           Y         N
 *  Default        |      Y         Y           N         N
 *  Private        |      Y         N           N         N
 *
 * class : Is accessible in same class?
 * package : Is accessible in same package?
 * subclass : Is accessible in subclass that extends class which consider access modi. in different package?
 * world : Is accessible where A.M. not belongs from above three?   
 */

 package am_out.AccessModifiers_pkg1;

 class c1{
     public int a=10;
     protected int b=20;
     int c=30;
     private int d=40;

     // Check for same class
     void checkSameClass(){
         System.out.println("a="+a+"- public");    //Yes
         System.out.println("b="+b+"- protected");    //Yes
         System.out.println("c="+c+"- default");    //Yes
         System.out.println("d="+d+"- private");    //Yes
     }
 }

 public class AccessModifiers{
     public static void main(String []args){
        
        c1 obj=new c1();
        System.out.println("***** class *****");
        obj.checkSameClass();

        // Check for Same package
        System.out.println("***** package *****");
        System.out.println("a="+obj.a+"- public");    //Yes
         System.out.println("b="+obj.b+"- protected");    //Yes
         System.out.println("c="+obj.c+"- default");    //Yes
        //  System.out.println("d="+obj.d);    //No - d is private
     }
 }

 