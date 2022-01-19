/** Define an interface using JAVA that contains a method to calculate the perimeter of object. Define two classes-
 * circle and rectangle with suitable fields and methods. Implement the interface"perimeter" in these classes. Write
 * the appropriate main() method to create object of each class and test all methods.*/

package AbstractClassesAndInterfaces;

import java.util.Scanner;

interface Perimeter{
    void calculate();
}
class Circle implements Perimeter{
    @Override
    public void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of circle:");
        float r=sc.nextFloat();
        System.out.println("Perimeter of circle: "+2*Math.PI*r );
    }
}
class Rectangle2 implements Perimeter{
    @Override
    public void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of Rectangle:");
        float l= sc.nextFloat();
        System.out.println("Enter Width of Rectangle:");
        float w= sc.nextFloat();
        System.out.println("Perimeter of rectangle: "+(2*(l+w)));
    }
}
public class Example_4_CalculatePerimeterUsingInterface_ACI {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.calculate();
        System.out.println("----------------------------------");
        Rectangle2 r=new Rectangle2();
        r.calculate();
    }
}