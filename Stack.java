package linear;

class Snode{
	int data;
	Snode next;
	public SNode (int data) {
		this.data=data;
}
public class Stack {
	static Snode top;
	static int count=-1;
	public static void push(int data) {
		Snode node= new SNode(data);
		if(count==-1) {
			System.out.println("stack is empty");
			return;
		}
	}
	public static void main(String[] args) {
		
	}
}
