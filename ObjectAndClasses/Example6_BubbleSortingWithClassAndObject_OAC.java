package ObjectAndClasses;

class BubbleSort
{
    int []a;
    BubbleSort(int []a){
        this.a=a;
    }

    void shorting(){
        for (int pass=1;pass<a.length;pass++){
            for (int i=0;i<a.length-1;i++){
                if (a[i] < a[i+1]) {
                    continue;
                }
                else{
                    int store=a[i];
                    a[i]=a[i+1];
                    a[i+1]=store;
                }
            }
        }

    }

    void display(){
        for(int i=0;i<a.length;i++)
            System.out.print("  "+a[i]);
        System.out.println("\n");
    }
}



public class Example6_BubbleSortingWithClassAndObject_OAC {
    public static void main(String[] args) {
        int []arr={15,16,6,8,5};
        BubbleSort Bsort=new BubbleSort(arr);
        System.out.println("Before Sorting:");
        Bsort.display();
        Bsort.shorting();
        System.out.println("After Sorting:");
        Bsort.display();
    }
}
