import java.util.List;
import java.io.*;
import java.util.*;
class Stack
{
    private int arr[];
    private int top;
    private int capacity;
 
  
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 
    
    public void push(int x)
    {
        if (isFull())
        {
            System.out.println("Stack OverFlow");
            System.exit(-1);
        }
 
        System.out.println("Push operation " + x);
        arr[++top] = x;
    }
 
   
    public int pop()
    {
       
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
 
        System.out.println("Pop operation " + peek());
 
        
        return arr[top--];
    }
 
    
    public int peek()
    {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            System.exit(-1);
        }
 
        return -1;
    }
 
  
    public int size() {
        return top + 1;
    }
 
    
    public boolean isEmpty() {
        return top == -1;              
    }
 
    
    public boolean isFull() {
        return top == capacity - 1;     
    }
}
 


public class Stackuserdefine {

    public static void main(String args[])
    {

        Stack stack = new Stack(10);

        stack.push(132);      
        stack.push(234);      
        stack.pop();        
        stack.pop();        
 
        stack.push(323);      
 
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());
 
        stack.pop();        
 
        // check if the stack is empty
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
    
}
