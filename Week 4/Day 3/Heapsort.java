import java.util.*;

public class Heapsort {

    void sort(int a[]) {
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }

        for(int i=n-1;i>0;i--)
        {
            int temp=a[0];
            a[0]=a[i];
            a[i]=temp;

            heapify(a, i, 0);

        }
    }

    void heapify(int a[], int n, int i) {
        int parent = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < n && a[left] > a[parent]) {
            parent = left;
        }
        if (right < n && a[right] > a[parent]) {
            parent = right;
        }

        if(parent!=i)
        {
            int temp=a[i];
            a[i]=a[parent];
            a[parent]=temp;

            heapify(a, n, parent);
        }

    }

    void print(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the values of array");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Heapsort h1 = new Heapsort();
        h1.sort(a);

        System.out.println("Sorted Elements");
        h1.print(a);

    }
}