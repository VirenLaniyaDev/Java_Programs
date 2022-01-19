package Generics;

class TestGenericClass<T> {
    private T val;
    private T val2;


    public TestGenericClass(T val){
        this.val=val;
    }

    public T getVal(){
        return val;
    }
    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }
}

public class _2_DefiningGenericClassesAndInterfaces {
    public static void main(String[] args) {

        TestGenericClass<Integer> tgc=new TestGenericClass<>(25);
        System.out.println("val="+tgc.getVal());
        tgc.setVal2(30);
        System.out.println("val2="+tgc.getVal2());

    }
}
