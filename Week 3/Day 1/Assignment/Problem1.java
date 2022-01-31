import java.io.*;
import java.util.*;

public class Problem1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the Size of Array");
        int n=sc.nextInt(); // get the length of array from user
        //declare array
        int a[]=new int[n];  // array declaration
        
        //get the values from user
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();      
        }


        int b[]=new int[n];     // declare new array 
        int j=n;

        //logic of reverse array
        for(int i=0;i<n;i++)
        {
            b[j-1]=a[i];
            j--;
        }
        System.out.println("Reverse array");
        for(int i=0;i<n;i++)
        {
           System.out.print(b[i]+" ");        //print the reverse array
        }

    }
}