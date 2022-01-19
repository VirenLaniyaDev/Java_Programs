// java am_out.AccessModifiers2 for run

package am_out;
import am_out.AccessModifiers_pkg1.PublicClassForAM2;

class c2 extends PublicClassForAM2{
    c2(){
        // Check for Subclass
        System.out.println("***** subclass *****");
        System.out.println("a="+a+"- public");    //Yes
        System.out.println("b="+b+"- protected");    //Yes
        // System.out.println("c="+obj.c+"- default");    //No - c is default
        //  System.out.println("d="+obj.d);    //No - d is private
    }
}

public class AccessModifiers2{
    public static void main(String []args){

        // Check for subclass
        c2 obj_c2 = new c2();

        PublicClassForAM2 obj=new PublicClassForAM2();
        // Check for World
        System.out.println("***** world *****");
        System.out.println("a="+obj.a+"- public");    //Yes
        // System.out.println("b="+obj.b+"- protected");    //No - b is protected
        // System.out.println("c="+obj.c+"- default");    //No - c is default
        //  System.out.println("d="+obj.d);    //No - d is private
    }
}