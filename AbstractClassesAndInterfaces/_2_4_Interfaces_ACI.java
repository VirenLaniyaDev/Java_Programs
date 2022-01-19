package AbstractClassesAndInterfaces;

interface P{
    int a=10;
    void MethodOfP();
}

// --> Whenever an interface inherits other interface then for inherit it use 'extends'.

interface P1 extends P{
    int b=15;
    void MethodOfP1();
}
interface P2 extends P{
    int c=20;
    void MethodOfP2();
}
interface P12 extends P1,P2{
    int d=25;
    void MethodOfP12();
}

class Q implements P12
{
    public void MethodOfP(){
        System.out.println("Method of interface P with value "+a);
    }
    public void MethodOfP1(){
        System.out.println("Method of interface P1 with value "+b);
    }
    public void MethodOfP2(){
        System.out.println("Method of interface P2 with value "+c);
    }
    public void MethodOfP12(){
        System.out.println("Method of interface P12 with value "+d);
    }
}
public class _2_4_Interfaces_ACI {
    public static void main(String[] args) {
        Q obj=new Q();
        obj.MethodOfP();
        obj.MethodOfP1();
        obj.MethodOfP2();
        obj.MethodOfP12();
    }
}
