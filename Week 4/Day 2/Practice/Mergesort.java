import java.io.*;
import java.util.*;



public class Mergesort {


    void merges(int a[],int start,int mid,int end)
    {
        int i,j,k;
        int n1=mid-start+1;
        int left[]=new int[n1];
        int n2=end-mid;
        int right[]=new int[n2];

        for(i=0;i<n1;i++)
        {
            left[i]=a[start+i];
        }

        for(j=0;j<n2;j++)
        {
            right[j]=a[mid+1+j];
        }

        i=0;
        j=0;
        k=start;

        while(i<n1 && j<n2)
        {
            if(left[i]<=right[j])
            {
                a[k]=left[i];
                i++;
            }
            else 
            {
                a[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<n1)
        {
            a[k]=left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            a[k]=right[j];
            j++;
            k++;
        }



    }

    void merge(int a[],int start,int end)
    {
        if(start<end)
        {
            int mid=(start+end)/2;
            merge(a,start,mid);
            merge(a,mid+1,end);
            merges(a,start,mid,end);
        }

    }


    void printarray(int a[],int n)
    {

        for(int i=0;i<n;i++)
        {
            System.out.print(" "+a[i]);
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

        Mergesort m1=new Mergesort();
        System.out.println("Print Data before Sorting");
        m1.printarray(a, n);

        m1.merge(a,0,n-1);
        System.out.println("Print Data after Sorting");
        m1.printarray(a, n);

    }
}
