import java.io.*;
import java.util.*;

public class Bubblesort {

    static void bubble(int a[])
    {
        int n=a.length;

        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }

            }
        }
    }
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();

        int a[]=new int[n];
        
        System.out.println("Enter the values of array");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        bubble(a);

        System.out.println("After sorting");

        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
        }
    }
}
