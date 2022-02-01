import java.io.*;
import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class Binarysearch {

    public static void bsearch(int a[],int first,int last,int ele)
    {
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(a[mid]<ele)
            {
                first=mid+1;
            }
            else if(a[mid]==ele)
            {
                System.out.println("Element found at location: "+mid);
                break;
            }
            else
            {
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last)
        {
            System.out.println("Element is not found in array");
            
        }
    }

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Elements must be in sorted order");
        System.out.println("Enter the values of array");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        System.out.println("Enter the Element you want to find");
        int ele=sc.nextInt();

        bsearch(a,0,n,ele);


    }
    
}
