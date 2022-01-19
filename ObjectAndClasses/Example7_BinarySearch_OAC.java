package ObjectAndClasses;

class BS
{
    int low,high,a[];
    BS(int arr[]){
        this.low=0;
        this.high=arr.length-1;
        this.a=arr;
    }

    void Search(int key){
        if(low>high)
        {
            System.out.println("not possible");
            return;
        }
        int mid=(low+high)/2;
        if (a[mid]==key) {
            System.out.println("position of element is:"+(mid+1));
            return;
        }
        else if (a[mid]>key){
            this.high=mid;
            Search(key);
        }
        else if (a[mid]<key){
            this.low=mid;
            Search(key);
        }
    }
}
public class Example7_BinarySearch_OAC
{
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60};
        BS bs = new BS(a);
        bs.Search(40);
    }
}
