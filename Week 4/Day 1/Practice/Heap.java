import java.io.*;
import java.util.*;

public class Heap {
    void heapify(ArrayList<Integer> ht,int i)
    {
        int n=ht.size();
        int largest=i;

        int l=2*i+1;
        int r=2*i+2;

        if(l<n && ht.get(l)>ht.get(largest))
        {
            largest=l;
        }
        if(r<n && ht.get(r)>ht.get(largest))
        {
            largest=r;
        }

        if(largest != i)
        {
            int temp=ht.get(largest);
            ht.set(largest,ht.get(i));
            ht.set(i,temp);

            heapify(ht, largest);
        }

    }

    void insert(ArrayList<Integer> ht,int val)
    {
        int n=ht.size();
        if(n==0)
        {
            ht.add(val);
        }
        else
        {
            ht.add(val);
            for(int i=n/2-1;i>=0;i--)
            {
                heapify(ht,i);
            }
        }
    }

    void deleteNode(ArrayList<Integer> ht,int num)
    {
        int n = ht.size();
        int i;
        for (i = 0; i < n; i++)
        {
            if (num == ht.get(i))
                break;
        }

        int temp = ht.get(i);
        ht.set(i, ht.get(n-1));
        ht.set(n-1, temp);

        ht.remove(n-1);
        for (int j = n / 2 - 1; j >= 0; j--)
        {
            heapify(ht, j);
        }

    }

    void printArray(ArrayList<Integer> array, int size) {
        for (Integer i : array) {
          System.out.print(i + " ");
        }
        System.out.println();
      }
    public static void main(String args[]) {
        
        ArrayList<Integer> array = new ArrayList<Integer>();
        int size = array.size();

        Heap h=new Heap();

        h.insert(array, 10);
        h.insert(array, 32);
        h.insert(array, 43);
        h.insert(array, 125);
        h.insert(array, 44);

        System.out.println("Max-Heap array: ");
        h.printArray(array, size);

        h.deleteNode(array, 32);
        System.out.println("After deleting an element: ");
        h.printArray(array, size);



    }
}
