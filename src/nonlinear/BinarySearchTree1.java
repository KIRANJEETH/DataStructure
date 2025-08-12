package nonlinear;
import java.util.*;

class BNode{
    int data;
    BNode left, right;
    BNode(int data){
        this.data = data;
        left = right = null;
    }
}

class BOps{
    static BNode root;
    
    public static void Insertion(int data) {
        BNode newNode = new BNode(data);
        if(root==null) {
            root = newNode;
            return;
        }else {
            Queue<BNode> track = new LinkedList<>();
            track.add(root);
            while(!track.isEmpty()) {
                BNode temp = track.poll();
                if(temp.left==null) {
                    temp.left = newNode;
                    return;
                }else {
                    track.add(temp.left);
                }
                if(temp.right==null) {
                    temp.right = newNode;
                    return;
                }else {
                    track.add(temp.right);
                }
            }
        }
    }
    
    public static void Preorder(BNode root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    
    public static void Postorder(BNode root) {
        if(root!=null) {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public static void Inorder(BNode root) {
        if(root!=null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    
    public static boolean Search(BNode root, int data) {
        if(root!=null) {
            if(root.data==data) {
                return true;
            }else {
                return Search(root.right, data) || Search(root.left, data);
            }
        }
        return false;
    }
}

public class BinarySearchTree1 extends BOps{
    public static void main(String a[]) {
        Insertion(15);
        Insertion(8);
        Insertion(20);
        Insertion(12);
        Insertion(6);
        Insertion(4);
        Insertion(16);
        System.out.print("Preorder :");
        Preorder(root);
        System.out.print("\nInorder :");
        Inorder(root);
        System.out.print("\nPostorder :");
        Postorder(root);
        System.out.println();
        System.out.println(Search(root, 10)?"Its there":"Its not there");
    }
}
