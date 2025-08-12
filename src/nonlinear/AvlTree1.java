package nonlinear;

class Anode{
    int data;
    int height;
    Anode left, right;
    Anode(int data){
        this.data = data;
        left=right=null;
        this.height = 1;
    }
}

class Amethods{
    static Anode root;
    
    public static Anode createNode(int data) {
        return new Anode(data);
    }
    
    public static int height(Anode root) {
        return root==null?0:root.height;
    }
    
    public static int balance(Anode root){
        return root==null?0:height(root.left)-height(root.right);
    }
    
    public static Anode Insert(Anode root, int data) {
        if(root==null) return createNode(data);
        if(data<root.data) {
            root.left = Insert(root.left, data);
        }else if(data>root.data) {
            root.right = Insert(root.right, data);
        }
        else return root;
        
        root.height = 1+Math.max(height(root.left), height(root.right));
        
        int bal = balance(root);
        
        if(bal>1 && data<root.left.data) {
            return rightRotate(root);
        }
        if(bal<-1 && data>root.right.data) {
            return leftRotate(root);
        }
        if(bal>1 && data<root.left.data) {
            root.left =leftRotate(root.left);
            return rightRotate(root);
        }
        if(bal<-1 && data<root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }
        
        return root;
    }
    
    public static Anode rightRotate(Anode y) {
        Anode x = y.left;
        Anode t2 = x.right;
        x.right = y;
        y.left = t2;
        y.height=Math.max(height(y.left), height(y.right))+1;
        
        return x;
    }
    
    public static Anode leftRotate(Anode x) {
        Anode y = x.right;
        Anode t2 = y.left;
        
        y.left = x;
        x.right = t2;
        
        x.height = Math.max(height(x.left), height(x.right))+1;
        y.height = Math.max(height(y.left), height(y.right))+1;
        
        return y;
        
    }
    
    public static void m() {
        root.height = 1+Math.max(height(root.left), height(root.right));
    }
    
    public static void Inorder(Anode root) {
        if(root!=null) {
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);
        }
    }
    
    public static void Postorder(Anode root) {
        if(root!=null) {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    
    public static void Preorder(Anode root) {
        if(root!=null) {
            System.out.print(root.data+" ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
}

public class AvlTree1 extends Amethods{
    public static void main(String arg[]) {
        
        root=Insert(root, 40);
        root=Insert(root, 30);
        root=Insert(root, 50);
        Inorder(root);
        System.out.println();
        Postorder(root);
        System.out.println();
        Preorder(root);
    }
}
