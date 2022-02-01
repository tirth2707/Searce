import java.io.*;
import java.util.*;

public class Linearsearch
{
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter the values of array");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the Element you want to find");
        int ele=sc.nextInt();
        int temp=-1;
        for(int i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                temp=0;
                System.out.println("Element found at location: "+i);
                
            }
        }
        if(temp==-1)
        {
            System.out.println("Element is not found in array");
        }

    }
}