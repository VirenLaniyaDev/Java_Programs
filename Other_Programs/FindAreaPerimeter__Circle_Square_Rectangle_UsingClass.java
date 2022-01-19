package Other_Programs;

import java.util.Scanner;

public class FindAreaPerimeter__Circle_Square_Rectangle_UsingClass{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Shape Which you want for finding Area and Perimeter::");
        System.out.println("1.Circle\n2.Square\n3.Rectangle");
        int choice=sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Enter Radius of Circle:");
                float r= sc.nextFloat();
                Circle C=new Circle();
                C.Radius=r;
                C.Area();
                C.circumference();
                break;
            case 2:
                System.out.println("Enter side scale of square::");
                float s= sc.nextFloat();
                Square sq=new Square();
                sq.Side=s;
                sq.Area();
                sq.perimeter();
                break;
            case 3:
                System.out.println("Enter length of rectangle::");
                float l= sc.nextFloat();
                System.out.println("Enter width of rectangle::");
                float w= sc.nextFloat();
                Rectangle re=new Rectangle();
                re.length=l;
                re.width=w;
                re.Area();
                re.perimeter();
                break;
            default:
                System.out.println("Error!This Operation is not Present in List.");
        }
    }
}

class Circle
{
    float Radius;

    void Area()
    {
        System.out.println("Area of Circle:  "+Math.PI*Radius*Radius);
    }

    void circumference()
    {
        System.out.println("Circumference of Circle:  "+2*Math.PI*Radius);
    }
}

class Square
{
    float Side;

    void Area()
    {
        System.out.println("Area of Square:  "+Side*Side);
    }

    void perimeter()
    {
        System.out.println("Perimeter of Square:  "+4*Side);
    }
}

class Rectangle
{
    float length,width;

    void Area()
    {
        System.out.println("Area of Rectangle:  "+length*width);
    }

    void perimeter()
    {
        System.out.println("Perimeter of Rectangle:  "+2*(length+width));
    }
}