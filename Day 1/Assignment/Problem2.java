import java.io.*;
import java.util.*;

public class Problem2 {

    //linkedlist Node Structure 
    class Node{

        int data;       //data
        Node next;      //link

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public Node head = null;  
    public Node temp = null;  

    public void addnode(int data)
    {
        Node newnode = new Node(data);

        if(head==null)      //if linkedlist is empty than store node as a head
        {
            head=newnode;
            temp=newnode;
        }
        else                
        {
            temp.next=newnode;
            temp=newnode;
        }
        
    }

    public void display()
    {
        Node temp=head;
        if(temp==null)
        {
            System.out.println("Linkedlist is Empty");
            return;
        }
        System.out.println("Linked list:");
        while(temp!=null)               //traverse till temp is not null
        {   
            System.out.print(temp.data+" ");    //print data
            temp=temp.next;     //increment temp
        }
        System.out.println("");
        

    }

    public static void main(String args[])
    {
        Problem2 linkedlist = new Problem2();

       
        linkedlist.addnode(1);
        linkedlist.addnode(25325);
        linkedlist.addnode(25125);
        linkedlist.addnode(25345);
        linkedlist.addnode(22355);
        linkedlist.addnode(55);
        linkedlist.addnode(5);
        
        linkedlist.display();


    }
    
}
