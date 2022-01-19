package AbstractClassesAndInterfaces;

interface Shape_2{
    void draw();
    double getArea();
}

class Circle_2 implements Shape_2{
    private double r;
    public void setR(double r){
        this.r=r;
    }
    public double getR(){
        return r;
    }
    public double getArea(){
        return (Math.PI*r*r);
    }
    public void draw(){
        System.out.println("Area of circle is: "+getArea());
    }
}

class Rectangle_2 implements Shape_2{
    private double l,w;
    public void setL(double l){
        this.l=l;
    }
    public void setW(double w){
        this.w=w;
    }
    public double getL(){
        return l;
    }
    public double getW(){
        return w;
    }
    public double getArea(){
        return (2*(l+w));
    }
    public void draw(){
        System.out.println("Area of Rectangle is: "+getArea());
    }
}
public class Example_5_ShapeAreaUsingInterfaces_ACI {
    public static void main(String[] args) {
        System.out.println("*********** Circle ***********");
        Circle_2 obj1=new Circle_2();
        obj1.setR(10);
        System.out.println("Radius of circle is: "+obj1.getR());
        obj1.draw();
        System.out.println();
        System.out.println("*********** Rectangle ***********");
        Rectangle_2 obj2=new Rectangle_2();
        obj2.setL(10);
        obj2.setW(20);
        System.out.println("Length of rectangle: "+obj2.getL());
        System.out.println("Width of rectangle: "+obj2.getW());
        obj2.draw();
    }
}
