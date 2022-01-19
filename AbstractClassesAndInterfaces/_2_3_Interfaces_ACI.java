package AbstractClassesAndInterfaces;

interface Camera{
    void cepture();
}

class Phone implements Camera{
    @Override
    public void cepture(){
        System.out.println("Capturing the movement...");
    }
    void calling(){
        System.out.println("Calling...");
    }
}
public class _2_3_Interfaces_ACI {
    public static void main(String[] args) {
        Camera obj=new Phone();     //We create object of Camera but we provide Phone as a Camera.
                                     /*[Illustration]: We provide Phone to obj as Camera. obj can use only that functionality
                                     * which is present in camera. obj can not use other functionality of Phone.*/

        obj.cepture();
        //obj.calling();    //->It gives an error because obj can't use calling method.

    }
}
