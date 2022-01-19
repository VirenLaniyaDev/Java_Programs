/** It is required to maintain and process the status of the 9 resources. The status value is to be stored in an
 *  integer array of dimention. The valid status of a resource can be one of the following :
 *      Free : indicated by integer value 0
 *      Occupied : indicated by integer value 1
 *      Inaccessible : indicated by integer value 2
 *  Accept initial status values from user and counts and displays total number of free resources, total number of
 *  occupied resources and total number of inaccessible resources. The exception to be raised and handled if total
 *  number of occupied resources exceeds total number of free resources. The handler marks status of all inaccessible
 *  resources as a free.
 */


package ExceptionHandling;

import java.util.Scanner;

class ExceedResourceException extends Exception{
    ExceedResourceException(String msg){
        super(msg);
    }
}

class ResourceException extends Exception {
    ResourceException(String msg){
        super(msg);
    }
}

class ResourceStatusLogic{

    Scanner sc=new Scanner(System.in);
    int no_of_Free=0,no_of_Occupied=0,no_of_Inaccessible=0;
    int [][] statusref=new int[3][3];

    void ResourceInput()
    {
        System.out.println("Free resources denotes as 0\nOccupied resources denotes as 1\nInaccessible resources denotes as 2");
        System.out.println("Enter resources:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                statusref[i][j]=sc.nextInt();
        }
    }

    void ResourceCounter()
    {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(statusref[i][j]==0)
                    no_of_Free++;
                else if(statusref[i][j]==1)
                    no_of_Occupied++;
                else if(statusref[i][j]==2)
                    no_of_Inaccessible++;
                else
                    try {
                        throw new ResourceException("Exception:Please check your resources, Something is wrong!!!");
                    }
                    catch(ResourceException re){
                        System.out.println(re.getMessage());
                    }
            }
        }
    }

    void ExceptionHandler()
    {
        try {
            if (no_of_Free < no_of_Occupied) {
                throw new ExceedResourceException("Exception:Total number of Occupied resources exceeds Total number of free resources.");
            }
        }
        catch(ExceedResourceException ere){
            no_of_Free=no_of_Free+no_of_Inaccessible;
            no_of_Inaccessible=0;
            System.out.println(ere.getMessage());
        }
    }

    void ResourceOutput()
    {
        System.out.println("---------------------------------------------");
        System.out.println("Total Number of Free resources: "+no_of_Free);
        System.out.println("Total Number of Occupied resources: "+no_of_Occupied);
        System.out.println("Total Number of Inaccessible resources: "+no_of_Inaccessible);
    }

}

public class Example_3_ResourceStatus_EH extends Exception {
    public static void main(String[] args) {

        ResourceStatusLogic rsl=new ResourceStatusLogic();
        rsl.ResourceInput();
        rsl.ResourceCounter();
        rsl.ExceptionHandler();
        rsl.ResourceOutput();
    }
}
