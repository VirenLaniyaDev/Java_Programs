package ObjectAndClasses;

class Rectangle1    //Define Class
{
    double Center_X,Center_Y,width,height;  //Data field
    double Left_X,Right_X,Up_Y,Down_Y;      //Data field

    Rectangle1()    //Constructor
    {
        Center_X=Center_Y=0;
        width=height=1;
    }

    Rectangle1(double x,double y,double h,double w)     // Parameterized Constructor
    {
        Center_X=x;
        Center_Y=y;
        height=h;
        width=w;
    }

    double getArea()
    {
        return width*height;
    }       //Method

    double getPerimeter()
    {
        return 2*(width+height);
    }   //Method

    boolean contains(double x,double y)     //Method
    {
        Left_X=Center_X-(width/2);
        Right_X=Center_X+(width/2);
        Up_Y=Center_Y+(height/2);
        Down_Y=Center_Y-(height/2);

        if((x>Left_X && x<Right_X) && (y>Down_Y && y<Up_Y))
            return true;
        else
            return false;
    }
}


public class Example1_Rectangle_OAC
{
    public static void main(String[] args) {        //main Method

        Rectangle1 obj1=new Rectangle1();   //Object obj1 of Rectangle1(with Default values)
        System.out.println("Area:"+obj1.getArea()); //Call getArea() which is present in obj1.
        System.out.println("Perimeter:"+obj1.getPerimeter());   //Call getPerimeter() which is present in obj1.
        if(obj1.contains(10, 20))   //Call contains() which is present in obj1.
            System.out.println("(10,20) is inside the rectangle ");
        else
            System.out.println("(10,20) is not inside the rectangle ");

        System.out.println("-----------------------------------------------\n");

        Rectangle1 obj2=new Rectangle1(30,20,20,35);    //Object obj2 of Rectangle1(with User Define values)
        System.out.println("Area:"+obj2.getArea()); //Call getArea() which is present in obj2.
        System.out.println("Perimeter:"+obj2.getPerimeter());   //Call getPerimeter() which is present in obj2.
        if(obj2.contains(15, 20))   //Call contains() which is present in obj2.
            System.out.println("(15,20) is inside the rectangle ");
        else
            System.out.println("(15,20) is not inside the rectangle ");

    }
}



