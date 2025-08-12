package nonlinear;

class BSnode{
    int data;
    BSnode right, left;
    BSnode(int data){
        this.data = data;
        right=left=null;
    }
}

class BSmethods{
    static BSnode root;
    
    public static BSnode Insertion(int data, BSnode root) {
        BSnode newNode = new BSnode(data);
        if(root==null) {
            return newNode;
        }
            if(root.data>data) {
                root.left = Insertion(data, root.left);
            }else if(root.data<data) {
                root.right = Insertion(data, root.right);
            }
        
        return root;
    }
    
    public static BSnode Search(BSnode root, int x) {
        if(root != null) {
            if(x < root.data)
                return Search(root.left, x);
            else if(x > root.data)
                return Search(root.right, x);
            else {
                System.out.println("\nAVAILABLE");
                return root;
            }
        }
        System.out.println("\nUNAVAILABLE");
        return null;
    }
    
    public static void Preorder(BSnode root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    
    public static void Postorder(BSnode root) {
        if(root!=null) {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public static void Inorder(BSnode root) {
        if(root!=null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
}

public class BinarySearchTree2 extends BSmethods{
    public static void main(String a[]) {
        root = Insertion(26, root);
        root = Insertion(22, root);
        root = Insertion(120, root);
        root = Insertion(70, root);
        root = Insertion(7, root);
        root = Insertion(11, root);
        root = Insertion(6, root);
        Postorder(root);
        System.out.println();
        Preorder(root);
        System.out.println();
        Inorder(root);
        Search(root, 22);
    }
}
