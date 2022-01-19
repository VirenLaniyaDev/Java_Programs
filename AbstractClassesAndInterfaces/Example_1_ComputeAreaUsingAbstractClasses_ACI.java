/** Create an abstract base class shape with two members base and height, a member function for initialization and a
 * pure virtual function to compute area(). Derive two specific classes triangle and rectangle which override the function
 * area(). Use these classes in a main function and display the area of a triangle and a rectangle.*/


package AbstractClassesAndInterfaces;

abstract class Shape
{
    double base,height;
    double a;
    void initfun(){
        this.base=10;
        this.height=5;
    }
    abstract void compute_area();
}

class triangle extends Shape{
    void compute_area(){
        a=(base*height)/2;
        System.out.println("Area of Triangle : "+a);
    }
}
class rectangle extends Shape{
    void compute_area(){
        a=(base*height);
        System.out.println("Area of Rectangle : "+a);
    }
}
public class Example_1_ComputeAreaUsingAbstractClasses_ACI {
    public static void main(String[] args) {
        triangle tri=new triangle();
        tri.initfun();
        tri.compute_area();
        rectangle rect=new rectangle();
        rect.initfun();
        rect.compute_area();
    }
}
