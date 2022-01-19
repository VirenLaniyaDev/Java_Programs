package AbstractClassesAndInterfaces;

abstract class Vegetable{
    Vegetable(){}
    String color;
    @Override
    abstract public String toString();
}
class Potato extends Vegetable{
    public String toString(){
        color="YELLOW";
        return "The color of Potato is :"+color;
    }
}

class Brinjal extends Vegetable{
    public String toString(){
        color="PURPlE";
        return "The color of Brinjal is :"+color;
    }
}
class Tomato extends Vegetable{
    public String toString(){
        color="RED";
        return "The color of tomato is :"+color;
    }
}
public class Example_2_GiveVegetableColorUsingAbstractClasses_ACI {
    public static void main(String[] args) {
        Potato p=new Potato();
        System.out.println(p.toString());
        Brinjal b=new Brinjal();
        System.out.println(b.toString());
        Tomato t=new Tomato();
        System.out.println(t.toString());
    }
}
