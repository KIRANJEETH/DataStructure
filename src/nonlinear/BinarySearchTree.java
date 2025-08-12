package nonlinear;
import java.util.*;

class Tnode {
    int data;
    Tnode left, right;
    public Tnode(int data) {
        this.data = data;
        left = right = null;
    }
}
public class BinarySearchTree {
    static Tnode root;
    public static void insert(int data) {
        root = insertRec(root, data);
    }

    private static Tnode insertRec(Tnode root, int data) {
        if (root == null) {
            root = new Tnode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    public static void preOrder(Tnode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(Tnode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(Tnode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static boolean search(Tnode root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        return (data < root.data) ? search(root.left, data) : search(root.right, data);
    }
    public static void main(String[] args) {
        insert(15);
        insert(8);
        insert(20);
        insert(12);
        insert(6);
        insert(4);
        insert(16);

        System.out.print("PreOrder: ");
        preOrder(root);
        System.out.println();

        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        postOrder(root);
        System.out.println();

        System.out.println("Search 1002: " + search(root, 12));
        System.out.println("Search 12: " + search(root, 12));
    }
}
