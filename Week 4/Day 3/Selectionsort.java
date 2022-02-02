import java.util.*;
public class Selectionsort {

    void sort(int a[])
    {
        int n=a.length;

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }

            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the values of array");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Selectionsort s1= new Selectionsort();
        
        s1.sort(a);
        s1. printArray(a);

    }
    
}
