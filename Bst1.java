package nonlinear;
class Tnode{
	int data;
	Tnode left,right;
	public Tnode(int data) {
		this.data=data;
		left=right=null;
	}
}
public class Bst1 {
	static Tnode root;
	public static void insert(int data) {
		Tnode node=new Tnode(data);
		if(root==null) {
			root=null;
		}
	}
	public static void main(String[] args) {
		insert(15);
		insert(8);
		insert(20);
		insert(12);
		insert(6);
		insert(4);
		insert(16);		
	}
}
