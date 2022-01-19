/** The transport interface declares a deliver() method. The abstract class Animal is the super class of Tiger, Camel, Deer
 * and Donkey classes. The transport interface is implemented by the Camel and Donkey classes. Write a test program to
 * initialize an array object. If the object implements the transport interface, the deliver() method is invoked. */

package AbstractClassesAndInterfaces;

interface Transport{
    void deliver();
}

abstract class Animal_2{
}

class Tiger extends Animal_2{
}

class Camel extends Animal_2 implements Transport{
    public void deliver(){
        System.out.println("Driver method of camel");
    }
}
class Deer extends Animal_2{
}

class Donkey_2 extends Animal_2 implements Transport{
    public void deliver(){
        System.out.println("Driver method of Donkey_2");
    }
}

public class Example_6_TransportAnimal_ACI {
    public static void main(String[] args) {
        Transport obj=new Camel();
        Transport [] a=new Transport[4];
        a[0]=new Camel();
        a[1]=new Donkey_2();
        a[0].deliver();
        a[1].deliver();
    }
}