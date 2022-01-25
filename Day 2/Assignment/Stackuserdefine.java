
// Problem 1 Day 2

package Assignment;

import java.util.List;
import java.io.*;
import java.util.*;

class Stack {
    private int arr[];
    private int arr1[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        arr1 = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            System.exit(-1);
        }

        if (top == -1) {
            System.out.println("Push operation " + x);
            top++;
            arr[top] = x;
            arr1[top] = x;
        } else {
            top++;
            arr[top] = x;
            if (x > arr[top - 1]) {
                arr1[top] = x;
            } else {
                arr1[top] = arr1[top - 1];
            }
        }

        // System.out.println("Push operation " + x);
        // top++;
        // arr[top] = x;
    }

    public int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }

        System.out.println("Pop operation:-" + peek());

        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }

        return -1;
    }

    public int max() {
        if (!isEmpty()) {
            return arr1[top];
        } else {
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int size=0;
        System.out.println("Enter the Size of Stack: ");
        int size = sc.nextInt();
        Stack stack = new Stack(size);
        // Stack max = new Stack(size);
        boolean askForAnother = true;
        while (askForAnother) {
            System.out.println("\n 1-Push Operation 2-Pop Operation 3-Find Maximum Number 4-Exit: ");
            int temp = sc.nextInt();
            switch (temp) {
                case 1:
                    System.out.println("Enter Element to be Inserted: ");
                    int pushele = sc.nextInt();
                    stack.push(pushele);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Maximum element in stack is: "+stack.max());
                    break;
                case 4:
                    askForAnother = false;
                    break;

            }
        }

        
        System.out.println("Maximum element in stack is: "+stack.max());
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        
       
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        } else {
            System.out.println("The stack is not empty");
        }
    }

}
