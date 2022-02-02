import java.util.*;

public class Binarytree {

    static class Node {
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void insert(Node node, int value) {

        if (value < node.data) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println("  Inserted " + value + " to left of Node " + node.data);
                node.left = new Node(value);
            }

        } else if (value > node.data) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to Right of Node " + node.data);
                node.right = new Node(value);
            }
        }

    }

    public static void delete(Node node, int key) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            if (node.data == key) {
                node = null;
                return;
            } else {
                return;
            }

        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Node temp = null, keynode = null;
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.data == key) {
                keynode = temp;
            }
            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
        }
        if (keynode != null) {
            int x = temp.data;
            deleteDeepest(node, temp);
            keynode.data = x;
        }

    }

    public static void deleteDeepest(Node root, Node delnode) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp == delnode) {
                temp = null;
                return;
            }
            if (temp.right != null) {
                if (temp.right == delnode) {
                    temp.right = null;
                    return;
                } else {
                    q.add(temp.right);
                }

            }
            if (temp.left != null) {
                if (temp.left == delnode) {
                    temp.left = null;
                    return;
                } else
                    q.add(temp.left);
            }

        }
    }

    public static void inorder(Node temp) {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }

    public static void main(String args[]) {

        Node rootnode = new Node(25);
        System.out.println("Building tree with root value " + rootnode.data);

        insert(rootnode, 11);
        insert(rootnode, 15);
        insert(rootnode, 16);
        insert(rootnode, 23);
        insert(rootnode, 79);
        System.out.println("");
        System.out.println("Inorder traversal before deletion: ");
        inorder(rootnode);
        System.out.println("");
        int key = 23;  
        System.out.println("");
        delete(rootnode, key);  
        System.out.println("Inorder traversal after deletion: ");
        inorder(rootnode);

    }

}
