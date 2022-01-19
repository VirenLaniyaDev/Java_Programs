package ObjectAndClasses;

class RetObjDemo
{
    int a;
    RetObjDemo(int val)
    {
        a=val;
    }
    RetObjDemo Return()
    {
        RetObjDemo temp=new RetObjDemo(a*a);
        return temp;
    }
}

public class Return_Object_From_Method
{
    public static void main(String[] args)
    {
        RetObjDemo obj1=new RetObjDemo(2);
        RetObjDemo obj2;
        obj2=obj1.Return();
        System.out.println(obj2.a);
    }
}
